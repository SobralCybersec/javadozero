package com.dev.aula1;

public class TypeCasting {

    /**
     *  Type Casting nada mais é que atribuir um novo tipo para uma variável
     *  Exemplo: int meuInt = 10;
     *  double meuDouble = meuInt;
     */

    public static void main(String[] args) {
        int meuInt = 10;
        double meuDouble = meuInt;
        String meuString = String.valueOf(meuDouble);

        System.out.println("Valor do meuInt: " + meuInt);

        System.out.println("Valor do meuDouble: " + meuDouble);

        System.out.println("Valor do meuString: " + meuString);
        // Ou

        System.out.println("Valor do meu double: " + (double) meuInt);
    }
}
