package C3l02interval;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();

        int b = sc.nextInt();

        for (int i = a; i < b; i++){
            System.out.print(i);
        }
    }
}
