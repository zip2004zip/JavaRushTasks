package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        // BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:/file.txt")));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (reader.ready()) {
            int data = Integer.parseInt(reader.readLine());
            list.add(data);
        }

        Collections.sort(list);

        // option 1
        for (Integer x : list) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

        // option 2
        //  list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        reader.close();
        bufferedReader.close();
    }
}