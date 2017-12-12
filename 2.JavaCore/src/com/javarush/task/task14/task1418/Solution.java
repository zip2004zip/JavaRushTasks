package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
1. Подумай что делает метод main.
2. Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
3. Найди блок кода которая заполняет значениями список и перемести его в метод initList.
4. Найди блок кода который в цикле for выводит на экран содержимое списка и перемести его в метод printListValues.
5. Найди блок кода в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран и перемести его в метод processCastedObjects.
6. Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
7. Исправь 2 ошибки в методе processCastedObjects связанные с приведением типов
— для объекта типа Float нужно вывести «Is float value defined? » + !([Float_object].isNaN()).
— для объекта типа Double нужно вывести «Is double value infinite? » + [Double_object].isInfinite().

Требования:
1. В классе Solution должны быть реализованы статические методы initList(List list), printListValues(List list), processCastedObjects(List list).
2. Метод initList должен заполнять полученный список произвольными значениями.
3. Метод printListValues должен выводить содержимое полученного списка на экран.
4. Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);

        /*//3
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));

        //4 - Исправь 2 ошибки
        for (int i = 0; i <= list.size(); i--) {
            System.out.println(list.get(i));
        }

        //5
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Double a = (Double) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Float a = (Float) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }*/
    }

    //3
    public static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    //4 - Исправь 2 ошибки
    public static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //5
    public static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
