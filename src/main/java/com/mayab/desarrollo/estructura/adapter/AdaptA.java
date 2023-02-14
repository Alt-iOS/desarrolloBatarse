package com.mayab.desarrollo.estructura.adapter;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class AdaptA implements Dept{

    private String name;
    DeptB deptB;

    public AdaptA(DeptB deptB){
        this.name = deptB.getName() + "" + deptB.getLastName();
        this.deptB = deptB;
    }
    @Override
    public void print() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: "+ getEdad());
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public int getEdad() {
        long age = ChronoUnit.YEARS.between(deptB.bornDate, LocalDate.now());
        return (int) age;
    }
}
