package com.mayab.desarrollo.comportamiento.strategy;

import java.util.Arrays;

public class BurbujaSort implements SortBehavior {
    @Override
    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Im sorting using BubleSort");
        //return arr;
    }
}
