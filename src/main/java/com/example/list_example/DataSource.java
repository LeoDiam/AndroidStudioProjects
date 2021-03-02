package com.example.list_example;

import java.util.ArrayList;

public class DataSource {
    public ArrayList getData() {
        ArrayList<String> mainMenu = new ArrayList<>();

        mainMenu.add("Εξέταση");
        mainMenu.add("Διάφορα αριθμημένα Τεστ");
        mainMenu.add("Πληροφορίες");
        mainMenu.add("Αξιολόγηση");
        mainMenu.add("Έξοδος");
        return mainMenu;
    }


}
