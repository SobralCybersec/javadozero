package com.dev.aula3;


import com.dev.utils.PlaySoundUtil;

/**
 * @author Matheus
 * @description  Classes aninhadas são classes que são definidas dentro de outras classes. Elas são úteis para agrupar classes relacionadas e para criar classes internas.
 */

public class ClassesAninhadas {

    public class Carro {

        public static class Motor {

            public void botarOMotorPraFuncionar() {
                System.out.println("RANDANDANDANDAN Motor Funcionando");
                PlaySoundUtil.playSound("/sons/motor.wav");
            }
        }
    }

    public static void main(String[] args) {
        ClassesAninhadas.Carro.Motor motor =
                new ClassesAninhadas.Carro.Motor();

        motor.botarOMotorPraFuncionar();
    }
}
