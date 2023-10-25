import java.util.Locale;
import java.util.Scanner;

public class CartaFormal {
    //Declarar variables
    public String tractament;
    public String nom;
    public String cognom1;
    public String cognom2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //Demanar
        String tractament = scanner.nextLine();
        String nom = scanner.nextLine();
        String cognom1 = scanner.nextLine();
        String cognom2 = scanner.nextLine();

        //Imprimir
        System.out.println(tractament + " " + cognom1 + " " + cognom2 + "," + " " + nom + "\n" );
        System.out.println("El principal objectiu de la present carta...");
    }
}