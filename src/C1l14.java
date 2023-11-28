import java.util.Locale;
import java.util.Scanner;

public class C1l14 {
    static int qtyPres;
    static int numeroPrest;
    static int llibresCaben;
    static int qtyLlibres;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        qtyPres = sc.nextInt();
        numeroPrest = sc.nextInt();
        llibresCaben = sc.nextInt();
        qtyLlibres = sc.nextInt();

        System.out.println(caben());
    }
    
    public static boolean caben() {
        return (qtyPres * numeroPrest * llibresCaben) >= qtyLlibres;
    }
}
