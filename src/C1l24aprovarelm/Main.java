package C1l24aprovarelm;

import java.util.Locale;
import java.util.Scanner;

class Modul {
    public boolean aprovat(int numeroPrUf1, int numeroPrLlUf1, int notaExamUf1, int numeroPrUf2, int numeroPrLlUf2, int notaExamUf2, int numeroPrUf3, int numeroPrLlUf3, int notaExamUf3){
        boolean aprovatuf1 = (numeroPrLlUf1 >= (75 * numeroPrUf1 /100) && notaExamUf1 >= 4) || ((numeroPrLlUf1 >= (50 * numeroPrUf1 /100) && notaExamUf1 >= 5) || notaExamUf1 > 7);
        boolean aprovatuf2 = (numeroPrLlUf2 >= (75 * numeroPrUf2 / 100) && notaExamUf2 >= 4) || (numeroPrLlUf2 == numeroPrUf2) || (numeroPrLlUf2 >= (50 * numeroPrUf2 / 100) && notaExamUf2 >= 5);
        boolean aprovatuf3 = (numeroPrLlUf3 == numeroPrUf3) && (notaExamUf3 >= 5);
        return aprovatuf1 && aprovatuf2 && aprovatuf3;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Modul m1 = new Modul();

        System.out.println(m1.aprovat(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
