package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        dictionary.put("Jon", 300);
        dictionary.put("Jimmi", 350);
        dictionary.put("Tomas", 500);
        dictionary.put("Killi", 210);
        dictionary.put("Gimm", 620);
        dictionary.put("Klon", 800);
        dictionary.put("Edio", 400);
        dictionary.put("Martin", 550);
        dictionary.put("Yuolit", 501);
        dictionary.put("Hrom", 250);
        return (HashMap<String, Integer>) dictionary;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //получение пары элементов
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> createMap = createMap();
        removeItemFromMap(createMap);
        /*for (Map.Entry<String, Integer> pair : createMap.entrySet()) {
            System.out.println(pair);
        }*/
    }
}