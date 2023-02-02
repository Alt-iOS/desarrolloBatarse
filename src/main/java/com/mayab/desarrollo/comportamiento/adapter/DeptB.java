package com.mayab.desarrollo.comportamiento.adapter;
import java.time.*;

public class DeptB {
    public String name;
    public String lastName;
    public LocalDate bornDate;

    public DeptB(String nombre, String apellidos, LocalDate fecha_nacimiento){
        this.name=nombre;
        this.lastName = apellidos;
        this.bornDate = fecha_nacimiento;
    }

    public String getName(){ return name;}
    public String getLastName(){return lastName;}
    public LocalDate getAge(){return bornDate;}
    public void print(){
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Fecha de nacimiento: " + bornDate);
    }
}
