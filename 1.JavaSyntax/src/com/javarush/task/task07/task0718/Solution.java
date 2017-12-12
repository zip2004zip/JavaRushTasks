package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < arrayList.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

