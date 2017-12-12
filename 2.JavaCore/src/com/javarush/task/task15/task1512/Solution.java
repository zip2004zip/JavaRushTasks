package com.javarush.task.task15.task1512;

/* 
Максимально простой код-2
Посмотри, что, связанное с конструкторами, может быть добавлено при компиляции, но в этой программе уже присутствует.
Упрости код — удали все конструкторы и вызовы конструкторов супер-классов, которые создаются и добавляются автоматически.
PS: Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a (наследование): http://en.wikipedia.org/wiki/Is-a
http://cs7002.vk.me/c7007/v7007577/1411a/_dAiEola310.jpg

Требования:
1. Класс NormalCat должен быть потомком класса NakedCat.
2. Класс SiamCat должен быть потомком класса NormalCat.
3. В классе NakedCat не должно быть явно реализованных конструкторов без параметров.
4. В конструкторе без параметров класса NormalCat не должно быть явного вызова конструктора родительского класса.
*/

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
        /*public NakedCat() {
            super();
        }*/
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
            super();
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
