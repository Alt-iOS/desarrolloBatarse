package com.mayab.desarrollo.comportamiento.strategy;

import java.util.Arrays;

public class InsertionSort implements SortBehavior {
    @Override
    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Im sorting using InsertionSort");
        //return arr;
    }
}
