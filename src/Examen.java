import java.util.Locale;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        int numEnter1 = (int)num1;
        int numEnter2 = (int)num2;
        int numEnter3 = (int)num3;

        boolean dosSenar = !((numEnter1 % 2 != 0) || (numEnter2 % 2 != 0));
        boolean dosSenar1 = !((numEnter1 % 2 != 0) || (numEnter3 % 2 != 0));
        boolean unSenar = (numEnter1 % 2 != 0) && (numEnter2 % 2 == 0) && (numEnter3 % 2 == 0);
        boolean unSenar1 = (numEnter1 % 2 == 0) && (numEnter2 % 2 != 0) && (numEnter3 % 2 == 0);
        boolean unSenar2 = (numEnter1 % 2 == 0) && (numEnter2 % 2 == 0) && (numEnter3 % 2 != 0);
        boolean totsParells = !((numEnter1 % 2 == 0) && (numEnter2 % 2 == 0) && (numEnter3 % 2 == 0));

        System.out.println(dosSenar || dosSenar1 || unSenar || unSenar1 || unSenar2 || totsParells);
    }
}