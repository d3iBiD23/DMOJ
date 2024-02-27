package ObrirCandau;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clau = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            } else {
                array.add(numero);
            }
        }

        boolean obre = false;

        for (int i = 1; i < array.size() - 2; i++){
            int actual = array.get(i);
            int seguent = array.get(i+1);
            int anterior = array.get(i-1);

            if (clau == (anterior + actual) * seguent){
                obre = true;
                break;
            }
        }

        System.out.println(obre);
    }
}