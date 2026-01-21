package com.david.test.EXAMEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class notas {

    public static void main(String[] args) {
        ArrayList<HashMap<String,Double>> notas = new ArrayList<>();
        HashMap<String,Double> per1 = new HashMap<>();
        per1.put("P1", 5.0);
        per1.put("P2", 3.0);
        per1.put("P3", 4.0);
        per1.put("P4", 1.0);
        per1.put("P5", 2.0);

        HashMap<String,Double> per2 = new HashMap<>();
        per2.put("P1", 3.0);
        per2.put("P2", 3.0);
        per2.put("P3", 3.0);
        per2.put("P4", 3.0);
        per2.put("P5", 3.0);

        HashMap<String,Double> per3 = new HashMap<>();
        per3.put("P1", 1.0);
        per3.put("P2", 5.0);
        per3.put("P3", 5.0);
        per3.put("P4", 4.0);
        per3.put("P5", 3.0);

        notas.add(per1);
        notas.add(per2);
        notas.add(per3);

        ArrayList<Double> max1 = new ArrayList<>(notas.get(0).values());
        Double per1max = Collections.max(max1);
        Double per1min = Collections.min(max1);
        ArrayList<Double> per1ord = new ArrayList<>(max1);
        Collections.sort(per1ord);
        Double per1media = 0.0;
        for (int i = 0; i < max1.size(); i++) {
            per1media += max1.get(i);
        }
        per1media = per1media / max1.size();

        ArrayList<Double> max2 = new ArrayList<>(notas.get(1).values());
        Double per2max = Collections.max(max2);
        Double per2min = Collections.min(max2);
        ArrayList<Double> per2ord = new ArrayList<>(max2);
        Collections.sort(per2ord);
        Double per2media = 0.0;
        for (int i = 0; i < max2.size(); i++) {
            per2media += max2.get(i);
        }
        per2media = per2media / max2.size();

        ArrayList<Double> max3 = new ArrayList<>(notas.get(2).values());
        Double per3max = Collections.max(max3);
        Double per3min = Collections.min(max3);
        ArrayList<Double> per3ord = new ArrayList<>(max3);
        Collections.sort(per3ord);
        Double per3media = 0.0;
        for (int i = 0; i < max3.size(); i++) {
            per3media += max3.get(i);
        }
        per3media = per3media / max3.size();

        System.out.printf("La primera persona --> Max = %f , Min = %f , Ascendente = %s %n" , per1max, per1min, per1ord);
        System.out.printf("La segunda persona --> Max = %f , Min = %f , Ascendente = %s %n" , per2max, per2min, per2ord);
        System.out.printf("La tercera persona --> Max = %f , Min = %f , Ascendente = %s %n" , per3max, per3min, per3ord);

        Double mediafinal = (per1media + per2media + per3media) / 3;
        System.out.println("La media final es: " + mediafinal);
    }
}
