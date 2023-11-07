import java.util.Locale;
import java.util.Scanner;

public class contractarunxef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //Demanar nom
        String nom = scanner.nextLine();

        //Demanar edat
        int edat = scanner.nextInt();
        scanner.nextLine();

        //Demanar nivell d'estudis
        String nivellEstudis = scanner.nextLine();

        //Demanar anys experiència
        int anys = scanner.nextInt();
        scanner.nextLine();

        //Demanar tipus de cuina
        String tipusCuina = scanner.nextLine();

        //Imprimir acomiat
        System.out.println("El formulari de " + nom + " s'ha completat. Et contactarem si necessitem un xef de cuina " + tipusCuina + ".");
    }
}
