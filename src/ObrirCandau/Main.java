package ObrirCandau;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clau = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();

        while (true){
            if (clau == -1){
                break;
            }else {
                array.add(clau);
            }
        }

        boolean trobat = false;

        for (int i = 0; i < array.size() - 2; i++){
            int actual = array.get(i);
            int suma = array.get(i+1);
            int multi = array.get(i+2);


            if (clau == (actual + suma) * multi){
                trobat = true;
                break;
            }
        }
        System.out.println(trobat);
    }
}