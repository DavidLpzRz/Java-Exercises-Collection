package com.david.test.EXAMEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Venn {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5,6);
        Collections.addAll(list2, 2,4,6,8,10);

        HashSet<Integer> union;
        ArrayList<Integer> conjunto = new ArrayList<>();
        conjunto.addAll(list1);
        conjunto.addAll(list2);
        union = new HashSet<>(conjunto);
        System.out.println("Esta es la union: " + union);


        HashSet<Integer> comparacion = new HashSet<>(list1);
        HashSet<Integer> comparado = new HashSet<>(list2);
        comparacion.retainAll(comparado);
        System.out.println("Esta es la interseccion: " + comparacion);


        HashSet<Integer> diferencia = new HashSet<>(list1);
        HashSet<Integer> diferenciado = new HashSet<>(list2);
        diferencia.removeAll(diferenciado);
        System.out.println("Esta es la interseccion: " + diferencia);

        union.removeAll(comparacion);
        System.out.println("El contrario de la interseccion: " + union);
    }
}
