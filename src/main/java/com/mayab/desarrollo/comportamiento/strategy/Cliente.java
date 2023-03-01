package com.mayab.desarrollo.comportamiento.strategy;

public class Cliente {
    public static void main( String[] args ){
        //bubble Sort TEST
        int[] array = {1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior bubble = new BurbujaSort();
        ListaNum listadoTest = new ListaNum(array, bubble);
        listadoTest.performSort();
        listadoTest.display();
        //Sort Insert Sort test
        int[] array2 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior insertion = new InsertionSort();
        listadoTest.setArr(array2);
        listadoTest.setSb(insertion);
        listadoTest.performSort();
        listadoTest.display();
        // Shell sort test
        int[] array3 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior shell = new ShellSort();
        listadoTest.setArr(array3);
        listadoTest.setSb(shell);
        listadoTest.performSort();
        listadoTest.display();
        //Quick sort test
        int[] array4 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior quick = new QuickSort();
        listadoTest.setArr(array4);
        listadoTest.setSb(quick);
        listadoTest.performSort();
        listadoTest.display();

    }
}
