package com.mayab.desarrollo.comportamiento.template;

public abstract class Logger {
    protected Evento evento;
    public abstract String format();
    public void open(){
        System.out.println("Opening file");
    }
    public void save(){
        System.out.println("Saving file");
    }
    public void close(){
        System.out.println("Closing file");
    }

    public void write(Evento evento){
        this.evento = evento;
        open();
        System.out.println("Writing: "+format());
        save();
        close();
    }






}
