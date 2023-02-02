package com.mayab.desarrollo.comportamiento.strategy;

public class Cliente {
    public static void main( String[] args ){
        //Bubble Sort TEST
        int[] array = {1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior Bubble = new BurbujaSort();
        ListaNum listadoTest = new ListaNum(array, Bubble);
        listadoTest.performSort();
        listadoTest.display();
        //Sort Insert Sort test
        int[] array2 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior Insertion = new InsertionSort();
        listadoTest.setArr(array2);
        listadoTest.setSb(Insertion);
        listadoTest.performSort();
        listadoTest.display();
        // Shell sort test
        int[] array3 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior Shell = new ShellSort();
        listadoTest.setArr(array3);
        listadoTest.setSb(Shell);
        listadoTest.performSort();
        listadoTest.display();
        //Quick sort test
        int[] array4 ={1,2,4,75,23,976,3,45,345,7,4,453,34};
        SortBehavior Quick = new QuickSort();
        listadoTest.setArr(array4);
        listadoTest.setSb(Quick);
        listadoTest.performSort();
        listadoTest.display();

    }
}
