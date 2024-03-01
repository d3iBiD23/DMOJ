package C7l12factorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        System.out.println(calcularFactorial(n));


    }
    private static int calcularFactorial(int n){
        if (n <= 2){
            return n;
        }else {
            return n * calcularFactorial(n -1);
        }
    }
}
