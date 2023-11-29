package C1l24aprovarelm;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int numeroPrUf1 = scanner.nextInt();
        int numeroPrLlUf1 = scanner.nextInt();
        int notaExamUf1 = scanner.nextInt();

        int numeroPrUf2 = scanner.nextInt();
        int numeroPrLlUf2 = scanner.nextInt();
        int notaExamUf2 = scanner.nextInt();

        int numeroPrUf3 = scanner.nextInt();
        int numeroPrLlUf3 = scanner.nextInt();
        int notaExamUf3 = scanner.nextInt();

        boolean aprovatUf1 = (numeroPrLlUf1 >= (75 * numeroPrUf1 /100) && notaExamUf1 >= 4) || ((numeroPrLlUf1 >= (50 * numeroPrUf1 /100) && notaExamUf1 >= 5) || notaExamUf1 > 7);
        boolean aprovatUf2 = (numeroPrLlUf2 >= (75 * numeroPrUf2 / 100) && notaExamUf2 >= 4) || (numeroPrLlUf2 == numeroPrUf2) || (numeroPrLlUf2 >= (50 * numeroPrUf2 / 100) && notaExamUf2 >= 5);
        boolean aprovatUf3 = (numeroPrLlUf3 == numeroPrUf3) && (notaExamUf3 >= 5);

        boolean aprovatModul = aprovatUf1 && aprovatUf2 && aprovatUf3;

        System.out.println(aprovatModul);
    }
}
