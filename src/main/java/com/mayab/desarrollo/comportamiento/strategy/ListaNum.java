package com.mayab.desarrollo.comportamiento.strategy;

public class ListaNum {

    public SortBehavior sb;
    public int[] arr;
    public ListaNum(int[] arr, SortBehavior sb){
        this.arr=arr;
        this.sb = sb;
    }
    public void display(){
        for (int element: this.arr) {
            System.out.println(element);
        }
    }
    public void performSort(){
        this.sb.sort(this.arr);
    }
    public void setSb(SortBehavior sb){
        this.sb =sb;
    }
    public void setArr(int[] arr){
        this.arr =arr;
    }
}
