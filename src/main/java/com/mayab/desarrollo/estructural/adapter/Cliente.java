package com.mayab.desarrollo.estructural.adapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args){
        DeptB deptB = new DeptB("Victor", "Test", LocalDate.parse("2000-12-01"));
        Dept deptA = new DeptA("Victor Test", 21);
        Dept adaptA = new AdaptA(deptB);
        List<Dept> list = new ArrayList<Dept>();
        list.add(deptA);
        list.add(adaptA);
        for (int i=0; i< list.size();i++){
            System.out.println("-------Persona---" +(i+1)+ "------");
            list.get(i).print();
        }

    }
}
