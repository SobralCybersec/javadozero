package com.dev.aula1;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiposNaoPrimitivos {

    /**
     *  Tipos não primitivos em Java sãotipos de referência, são inseridos como referência na memória
     *  Exemplo: String, List, Map, etc.
     *
     */

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.dev.aula1");

        String nome = "Satu";
        int[] numeros = {1, 2, 3};
        double[] numeros2 = {1.1, 1.2, 1.3};
        String[] arrays = {"Oi", "Tchau"};
        List<Integer> lista = new ArrayList<>();
        HashMap<Integer, String> mapa = new HashMap<>();
        HashMap<String, Integer> hashmap = new HashMap<>();

        hashmap.put("Sérgio1", 1);
        hashmap.put("Sérgio2", 2);
        hashmap.put("Sérgio3", 3);


        if (hashmap.containsValue(1)){
            System.out.println(hashmap);
        }

        mapa.put(1, "Sérgio");
        mapa.put(2, "Sérgio");

        lista.add(1);
        lista.add(2);
        lista.add(3);

        if (logger.isLoggable(Level.INFO)) {
            logger.info(lista.toArray().toString());
            logger.info(numeros.toString());
            logger.info(nome);
            logger.info(mapa.toString());
        }
    }
}
