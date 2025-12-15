package com.dev.aula1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Escopo {

    /**
     *  Escopos são a área de atuação de uma variável, ou seja, onde ela pode ser acessada
     *  Exemplo: Global, Local, etc.
     *
     */

     // escopotest, Aqui eu não posso acessar

    static String escopoTest = "Escopo";

    // a partir daqui eu já posso acessar escopoTest

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.dev.aula1");


        if (logger.isLoggable(Level.INFO)) {
            logger.info(escopoTest);

        }
    }
}
