package com.david.test.EXAMEN;

import java.util.Collections;
import java.util.HashMap;

public class morse {

    public static String ES(String morse) {
        HashMap<String,String> mor = new HashMap<>();
        mor.put("a",".-");
        mor.put("b","-...");
        mor.put("c","-.-.");
        mor.put("d","-..");
        mor.put("e",".");
        mor.put("f","..-.");
        mor.put("g","--.");
        mor.put("h","....");
        mor.put("i","..");
        mor.put("j",".---");
        mor.put("k","-.-");
        mor.put("l",".-..");
        mor.put("m","--");
        mor.put("n","-.");
        mor.put("o","---");
        mor.put("p",".--.");
        mor.put("q","--.-");
        mor.put("r",".-.");
        mor.put("s","...");
        mor.put("t","-");
        mor.put("u","..-");
        mor.put("v","...-");
        mor.put("w",".--");
        mor.put("x","-..-");
        mor.put("y","-.--");
        mor.put("z","--..");

        String resultado = "";

        String[] palabras = morse.split("/");

        for (int i = 0; i < palabras.length; i++) {

            String[] letras = palabras[i].split(" ");

            for (int j = 0; j < letras.length; j++) {
                for (String pal : mor.keySet()) {
                    if (mor.get(pal).equals(letras[j])) {
                        resultado += pal;
                    }
                }
            }
            resultado += " ";
        }

        return resultado;
    }

    public static void main(String[] args) {
        String frase = ".... --- .-.. .- / -- ..- -. -.. ---";
        System.out.println(ES(frase));

    }
}
