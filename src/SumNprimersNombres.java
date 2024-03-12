import java.util.Locale;
import java.util.Scanner;

public class SumNprimersNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        System.out.println(suma(n));
    }
    private static int suma(int n){
        if (n <= 1){
            return n;
        }else {
            return n * suma(n-1);
        }
    }
}
