package yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class YamlReader {
    private final File yamlFile;
    private final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

    public YamlReader(File yamlFile) {
        this.yamlFile = yamlFile;
    }

    public YamlReader(String yamlFileName) {
        yamlFile = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", yamlFileName).toFile();
    }

    public <T> T readValue(Class<T> readClass) throws Exception {
        try {
            return objectMapper.readValue(yamlFile, readClass);
        } catch (IOException e) {
            throw new Exception(
                    String.format("Unable to read yaml file '%s' for class '%s'",
                            yamlFile.toString(), readClass.toString()), e);
        }
    }
}
