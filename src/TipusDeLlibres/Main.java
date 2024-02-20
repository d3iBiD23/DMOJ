package TipusDeLlibres;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int qtyLlibres = sc.nextInt();

        sc.nextLine();

        String[] llibres = sc.nextLine().split("\\s+");

        int[] llibresComprats = new int[llibres.length];

        int qtyMenys = Integer.MAX_VALUE;

        for (int i = 0; i < llibres.length; i++){
            llibresComprats[i] = sc.nextInt();
            if (llibresComprats[i] < qtyMenys){
                qtyMenys = llibresComprats[i];
            }
        }

        System.out.println("el llistat de llibres que menys tenim són:");

        for (int i = 0; i < llibres.length; i++){
            if (llibresComprats[i] == qtyMenys){
                System.out.println(llibres[i] + " " + qtyMenys);
            }
        }
    }
}
