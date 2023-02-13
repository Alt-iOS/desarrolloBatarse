package com.mayab.desarrollo.comportamiento.template;

public class Evento {

    private String fecha="";
    private String tipo="";
    private String hora="";
    private String msg="";
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Evento(String fecha, String tipo, String hora, String msg) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.hora = hora;
        this.msg = msg;
    }
}
