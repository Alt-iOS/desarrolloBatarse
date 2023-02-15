package com.mayab.desarrollo.estructural.proxy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("www.facebook.com");
        pages.add("www.instagram.com");
        pages.add("www.tiktok.com");
        PPage proxy = new PPage(pages);
        User u1 = new User(true, "Victor");
        User u2 = new User(false, "Sofia");
        proxy.open("www.facebook.com", u1);
        proxy.open("www.instagram.com", u2);
        proxy.open("www.tiktok.com", u2);




    }
}
