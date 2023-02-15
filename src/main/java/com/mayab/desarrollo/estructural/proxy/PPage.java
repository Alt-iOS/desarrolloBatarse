package com.mayab.desarrollo.estructural.proxy;

import java.util.ArrayList;


public class PPage implements Access{
    private Page page;
    private ArrayList<String> bannedPages;

    public PPage(ArrayList<String> bannedPages) {
        this.page = new Page();
        this.bannedPages = bannedPages;
    }

    @Override
    public void open(String nombre, User usuario) {
        if (!this.bannedPages.contains(nombre) || usuario.isAllowed()){
            this.page.open(nombre, usuario);
        }
        else{
            System.out.println("La pagina "+ nombre +" esta bloqueada para el usuario: " + usuario.getName());
        }
    }
}
