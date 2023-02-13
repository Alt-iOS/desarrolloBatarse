package com.mayab.desarrollo.comportamiento.template;

public class LoggerTXT extends Logger{
    @Override
    public String format() {
        return this.evento.getFecha() +" " + this.evento.getHora()+" - "+this.evento.getTipo()+" - "+this.evento.getMsg();
    }
}
