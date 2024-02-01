package CalculadoraAcumula;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float acc = 0;

        while (sc.hasNext()) {
            String operador = sc.next();
            if (operador.equals("END")) {
                break;
            }
            float numero = sc.nextFloat();
            acc = operacion(operador, numero, acc);
            System.out.println(acc);
        }

    }
    public static float operacion(String operador, float numero, float acc) {
        switch (operador) {
            case "+":
                return acc + numero;
            case "-":
                return acc - numero;
            case "*":
                return acc * numero;
            case "/":
                return acc / numero;
            default:
                return acc;
        }
    }
}
