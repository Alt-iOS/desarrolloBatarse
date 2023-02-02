package com.mayab.desarrollo.comportamiento.strategy;

import java.util.Arrays;

public class ShellSort implements SortBehavior {
    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Im sorting using ShellSort");
        //return arr;
    }
}
