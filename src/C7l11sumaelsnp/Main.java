package C7l11sumaelsnp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();

        System.out.println(sumaRecursiva(numero));
    }
    private static int sumaRecursiva(int n){
        if (n <= 1){
            return n;
        }else {
            return n + sumaRecursiva(n-1);
        }
    }
}
