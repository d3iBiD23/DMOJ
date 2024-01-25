package C2l03calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("MENU:\n1." +
                "-SUMAR\n2." +
                "-RESTAR\n3." +
                "-MULTIPLICAR\n4." +
                "-DIVIDIR\n" +
                "Esculli una opcio:");

        int operand1 = sc.nextInt();

        int operand2 = sc.nextInt();

        int opcio = sc.nextInt();

        int resultat = 0;

        switch (opcio) {
            case 1:
                resultat = operand1 + operand2;
                break;
            case 2:
                resultat = operand1 - operand2;
                break;
            case 3:
                resultat = operand1 * operand2;
                break;
            case 4:
                resultat = operand1 / operand2;
                break;
        }
        System.out.println(resultat);
    }
}
