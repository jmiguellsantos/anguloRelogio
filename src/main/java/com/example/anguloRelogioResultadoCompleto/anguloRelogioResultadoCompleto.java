package com.example.anguloRelogioResultadoCompleto;

import java.util.Scanner;

public class anguloRelogioResultadoCompleto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe as horas: ");

        int horas = Integer.parseInt(entrada.nextLine());
        System.out.print("Informe os minutos: ");

        int minutos = Integer.parseInt(entrada.nextLine());
        int angulo = retornaAnguloRelogio(horas, minutos);

        System.out.println("O ângulo entre os dois ponteiros é: " +
                angulo + " graus.");
    }

    public static int retornaAnguloRelogio(int horas, int minutos){
        horas = horas % 12;

        int ponteiro_horas = ((horas * 360) / 12) + ((minutos * 360) / (12 * 60));

        int ponteiro_minutos = (minutos * 360) / 60;

        int angulo = Math.abs(ponteiro_horas - ponteiro_minutos);

        if (angulo > 180) {
            angulo = 360 - angulo;
        }

        return angulo;
    }

}

