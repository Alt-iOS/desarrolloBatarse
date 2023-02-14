package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args){
        DeptB deptB = new DeptB("Victor", "Test", LocalDate.parse("2000-12-01"));
        DeptA deptA = new DeptA("Victor Test", 21);
        deptA.print();
        AdaptA adaptA = new AdaptA(deptB);
        adaptA.print();

    }
}
