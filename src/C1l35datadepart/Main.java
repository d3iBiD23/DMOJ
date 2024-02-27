package C1l35datadepart;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int diaC = sc.nextInt();
        int mesC = sc.nextInt();
        int anyC = sc.nextInt();

        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int any = sc.nextInt();

        boolean caducat = anyC < any || (anyC == any && mesC < mes) || (anyC == any && mesC == mes && diaC < dia);

        System.out.println(caducat);
    }
}
