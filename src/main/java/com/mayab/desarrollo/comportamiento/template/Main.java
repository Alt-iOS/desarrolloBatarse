package com.mayab.desarrollo.comportamiento.template;

public class Main {
    public static void main(String[] args){
        Evento eventoTest= new Evento("11/1/2023", "crash","11:00", "Esto es un test" );
        Logger CSV = new LoggerCSV();
        Logger TXT = new LoggerTXT();
        Logger JSON = new LoggerJSON();
        CSV.write(eventoTest);
        TXT.write(eventoTest);
        JSON.write(eventoTest);


    }
}

