package Enquestaframeworks;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println(iniciEnquesta());
        System.out.println(coneixesFramework());

        String resposta1 = sc.nextLine();

        if (resposta1.equals("no")) {
            agraimentSenseFramework();
        } else {
            registraRespostaAmbFramework(sc);
        }

    }

    private static void agraimentSenseFramework() {
        System.out.println("Gracies per contestar");
    }

    private static void registraRespostaAmbFramework(Scanner sc) {
        System.out.println("Quin?");
        String resposta2 = sc.nextLine();
        System.out.println("S'ha registrat la resposta: " + resposta2);
        System.out.println("Gracies per contestar");
    }

    private static String iniciEnquesta() {
        return "Benvingut a l'enquesta.";
    }

    private static String coneixesFramework() {
        return "Coneixes algun framework?";
    }
}
