package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
short b = (short) 45;
char c = (short)‘c’;
short s = (short)1005.22;
int i = (short)150000;
float f =(short)4.10f;
double d = (short)1.256d;
double result = (f * b) + (i / c) — (d * s) + 562.78d;

Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную b типа short.
4. Метод main() должен содержать переменную c типа char.
5. Метод main() должен содержать переменную s типа short.
6. Метод main() должен содержать переменную i типа int.
7. Метод main() должен содержать переменную f типа float.
8. Метод main() должен содержать переменную d типа double.
9. Метод main() должен содержать переменную result типа double.
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45;
        char c = (short) 'c';
        short s = (short) 1005.22;
        int i = 150000;
        float f = 4.10f;
        double d = 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        System.out.println("result: " + result);
    }
}