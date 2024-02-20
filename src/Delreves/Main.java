package Delreves;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        int numeros[] = new int[n];

        for (int i=0; i < n; i++){

            numeros[i] = sc.nextInt();

        }

        // Este bucle empieza por el ultimo numero que es "n - 1".
        // La condición i >= 0 asegura que el bucle continuará hasta que i sea igual o menor que cero.
        // El i-- significa que i se decrementará en cada iteración.

        for (int i = n - 1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
