# MethodsOfTranslation-IFMO

Task description: 

Calculation of arithmetic expressions with variables. <br>
As a result of translation, the value of expressions can be calculated,
in an expression allows the assignment of values to a number. Use integer variables.

For example: <br>
```
Input:
    a = 2;
    b = a + 2;
    c = a + b * (b - 3);
    a = 3;
    c = a + b * (b - 3);
Output:
    a = 2
    b = 4
    c = 6
    a = 3
    c = 7
```

---
**Modification:**

*Make operation right-associative operation ```**``` equals to power operation, such as
```2**3**2 === 2**(3**2)```