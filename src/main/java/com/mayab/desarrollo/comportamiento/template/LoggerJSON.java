package com.mayab.desarrollo.comportamiento.template;

public class LoggerJSON extends Logger{
    @Override
    public final String format() {
        return "{\n evento: {\n" + "'fecha': '"+this.evento.getFecha() +"',\n "
                +"'hora: '" +this.evento.getHora()+"',\n" +
                "'tipo: '"+this.evento.getTipo()+"',\n"+
                "'message: '"+ this.evento.getMsg()+"'\n}\b}";
    }
}
