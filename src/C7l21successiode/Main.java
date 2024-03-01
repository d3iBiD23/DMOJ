package C7l21successiode;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n);
        } else {
            System.out.println(fib(n, 2, 0, 1));
        }
    }

    private static int fib(int n, int i, int a, int b) {
        if (n == i) {
            // Cas base
            return a+b;
        } else {
            // Cas recursiu
            return fib(n, i + 1, b, a + b);
        }
    }
}