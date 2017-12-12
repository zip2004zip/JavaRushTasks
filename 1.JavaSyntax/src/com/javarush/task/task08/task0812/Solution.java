package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Самая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        int max = 1;
        int count = 1;
        for (int i = 0; i < 9; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) max = count;
        }
        System.out.println(max);
    }
}