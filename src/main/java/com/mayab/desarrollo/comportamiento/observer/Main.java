package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Subject testSubject = new Article();
        ObserverV Browser = new BrowserO(testSubject, 150);
        ObserverV Mail = new MailO(testSubject,150);
        ObserverV WA = new WhatsAppO(testSubject, 150);
        testSubject.setFlag(160);
        Browser.setFlag(120);
        Mail.setFlag(120);
        WA.setFlag(120);
        testSubject.setFlag(100);

    }
}
