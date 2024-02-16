package TipusDeLlibres;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int qtyLlibres = sc.nextInt();

        sc.nextLine();

        String[] nomLlibres = sc.nextLine().split("\\s+");

        int[] qtyTipusL = new int[nomLlibres.length];

        int qtyMenys = Integer.MAX_VALUE;

        for (int i = 0; i < nomLlibres.length; i++){
            qtyTipusL[i] = sc.nextInt();
            if (qtyTipusL[i] < qtyMenys){
                qtyMenys = qtyTipusL[i];
            }
        }
        System.out.println("el llistat de llibres que menys tenim són:");
        for (int i = 0; i < nomLlibres.length; i++){
            if (qtyTipusL[i] == qtyMenys){
                System.out.println(nomLlibres[i] + " " + qtyMenys);
            }
        }
    }
}
