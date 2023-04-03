package com.example.relogioangulo;

import java.util.Scanner;

public class anguloRelogio{
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
        if (horas == 12) {
            horas = 0;
        }

        int ponteiro_horas = horas * 30 + (minutos / 60) * 30;
        int ponteiro_minutos = (minutos * 6);

        int angulo = Math.abs(ponteiro_horas - ponteiro_minutos);

        if (ponteiro_horas > ponteiro_minutos) {
            angulo = ponteiro_horas - ponteiro_minutos;

        } else {
            angulo = ponteiro_minutos - ponteiro_horas;
        }

        if (angulo == 90) {
            angulo = angulo / 2;
        }
        return angulo;
    }
}
