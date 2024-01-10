package Nomesunnombreparell;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean Parell = (num1 % 2 == 0) || (num2 % 2 == 0) || (num3 % 2 == 0);
        boolean totsParells = !(num1 == 1) || !(num2 % 2 == 0) || !(num3 % 2 == 0);
        boolean dosParells = !((num1 % 2 == 0) && (num3 % 2 == 0));
        boolean dosParells1 = !((num1 % 2 == 0) && (num2 % 2 == 0));

        System.out.println(Parell && totsParells && dosParells && dosParells1);
    }
}