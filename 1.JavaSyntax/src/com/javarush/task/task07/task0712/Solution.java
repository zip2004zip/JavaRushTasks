package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());
        }

        String adl = arrayList.get(0);
        int jdl = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (adl.length() < arrayList.get(i).length()) {
                adl = arrayList.get(i);
                jdl = i;
            }
        }

        String acor = arrayList.get(0);
        int jcor = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (acor.length() > arrayList.get(i).length()) {
                acor = arrayList.get(i);
                jcor = i;
            }
        }

        if (jdl < jcor) {
            System.out.println(arrayList.get(jdl));
        } else if (jdl > jcor) {
            System.out.println(arrayList.get(jcor));
        }
    }
}