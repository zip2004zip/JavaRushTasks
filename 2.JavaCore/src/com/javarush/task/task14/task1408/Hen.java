package com.javarush.task.task14.task1408;

/**
 * Created by Sergei on 16.07.2017.
 */

public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я - курица.";
    }
}