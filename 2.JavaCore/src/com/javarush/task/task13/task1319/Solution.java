package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;


/* 
Запись в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String lineSeparator = System.getProperty("line.separator");
        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals("exit")) {
                writer.write(s);
                break;
            } else {
                writer.write(s + lineSeparator);
            }
        }
        writer.close();
        bufferedReader.close();
    }
}