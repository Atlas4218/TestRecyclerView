package com.example.testrecyclerview;

import java.util.ArrayList;


public class GesData {

    static String[] tailles = {"7.4E7 km²", "4.6E8 km²", "5.1E8 km²", "1.4E8 km²", "6.1E10 km²", "4.3E10 km²", "8.1E9 km²", "7.6E9 km²"};
    static String[] noms = {"Mercure", "Venus", "Terre", "Mars", "Jupiter", "Saturne", "Uranus", "Neptune"};



    public static void ajout(ArrayList<Donnee> list){
        for (int i = 0; i < Math.min(tailles.length, noms.length); i++) {
            list.add(new Donnee(noms[i], tailles[i]));
        }
    }
}
