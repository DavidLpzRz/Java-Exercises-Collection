package com.david.test.EXAMEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class numerosGrandes {

    public static void main(String[] args) {
        Random rm = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        HashMap<Integer, Double> fre = new HashMap<>();

        for (int i = 0; i < 100000; i++) {
            numeros.add(rm.nextInt(10));
        }

        for (int i = 0; i < 10; i++) {
            String frecuencia = "" + Collections.frequency(numeros,i);
            fre.putIfAbsent(i, Double.parseDouble(frecuencia) / 100000 * 100);
        }

        System.out.println(fre);
    }
}
