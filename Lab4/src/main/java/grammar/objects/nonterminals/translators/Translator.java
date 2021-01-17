package grammar.objects.nonterminals.translators;

import exceptions.grammar.CreateTranslatorWithCurrentCodeException;
import grammar.objects.nonterminals.NonTerminal;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Translator extends NonTerminal {
    private final Class<?> codeClass;
    private String argsString;

    public static class Code {
        private String argsString;
        private String codeString;

        public Code(String argsString, String codeString) {
            this.argsString = argsString;
            this.codeString = codeString;
        }

        public String getArgsString() {
            return argsString;
        }

        public String getCodeString() {
            return codeString;
        }
    }

    private final static String classTemplateFormat =
            "public class %s { " + System.lineSeparator() +
            "   public void run(Object... args) { " + System.lineSeparator() +
            "       %s " + System.lineSeparator() +
            "   }" + System.lineSeparator() +
            "}";

    public static int translatorCount = 0;

    public Translator(String grammarName, Code code) throws CreateTranslatorWithCurrentCodeException {
        super("Translator" + (Translator.translatorCount++));

        String name = super.getName();

        this.argsString = code.argsString;

        try {
            Path sourcePath = Paths.get("src", "main", "resources", grammarName, "java", name + ".java");

            Path sourceFilePath = sourcePath.getParent();
            sourceFilePath.toFile().mkdirs();

            Files.write(sourcePath, String.format(classTemplateFormat, name, code.codeString).getBytes());

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            compiler.run(null, null, null, sourcePath.toFile().getAbsolutePath());

            Path classPath = sourcePath.getParent().resolve(name + ".class");
            Path newClassPath = Paths.get("src", "main", "resources", grammarName, "class", name + ".class");

            Path classFilePath = newClassPath.getParent();
            classFilePath.toFile().mkdirs();

            Files.move(classPath, newClassPath, StandardCopyOption.REPLACE_EXISTING);

            URL classURL = newClassPath.getParent().toFile().toURI().toURL();
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{classURL});

            codeClass = Class.forName(name, true, classLoader);
            codeClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | IOException e) {
            throw new CreateTranslatorWithCurrentCodeException(
                    String.format("Couldn't create translator's class with name '%s' and code %s%s -> %s%s",
                            name, System.lineSeparator(), code.argsString, code.codeString, System.lineSeparator()),
                    e);
        }
    }

    public Class<?> getCodeClass() {
        return codeClass;
    }

    public void setArgsString(String argsString) {
        this.argsString = argsString;
    }

    public String getArgsString() {
        return argsString;
    }

    @Override
    public String toString() {
        return "$" + super.getName();
    }
}
