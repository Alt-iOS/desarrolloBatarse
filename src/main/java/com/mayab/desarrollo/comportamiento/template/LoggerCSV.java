package com.mayab.desarrollo.comportamiento.template;

public class LoggerCSV extends Logger{
    @Override
    public final String format() {
        return this.evento.getFecha() +", " + this.evento.getHora()+", "+this.evento.getTipo()+", "+this.evento.getMsg();
    }
}
