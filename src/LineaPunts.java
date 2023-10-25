import java.util.Locale;
import java.util.Scanner;

public class LineaPunts {

    public int nombrePunts;
    public String punts;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int numPunts = scanner.nextInt();

        scanner.nextLine();

        LineaPunts linea = new LineaPunts();
        linea.nombrePunts = numPunts;

        StringBuilder puntos = new StringBuilder();
        for (int i = 0; i < linea.nombrePunts; i++) {
            puntos.append(".");
        }

        linea.punts = puntos.toString();

        System.out.println(linea.punts);
    }
}
