package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<Double>();

        while (true) {
            Double i = Double.parseDouble(scanner.nextLine());
            if (i == -1) break;
            arrayList.add(i);
        }
        System.out.println(average(arrayList));
    }

    private static double average(ArrayList<Double> list) {
        double sum = 0;
        for (Double aList : list) {
            sum += aList;
        }
        return sum / list.size();
    }
}