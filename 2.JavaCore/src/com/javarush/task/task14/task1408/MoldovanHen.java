package com.javarush.task.task14.task1408;

/**
 * Created by Sergei on 16.07.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}