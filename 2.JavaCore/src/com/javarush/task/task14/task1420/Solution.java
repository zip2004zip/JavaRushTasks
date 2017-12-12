package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 <= 0 || num2 <= 0) {
            throw new Exception();
        }

        System.out.println(nod(num1, num2));
    }

    private static int nod(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a < 0 ? -a : a;
    }
}