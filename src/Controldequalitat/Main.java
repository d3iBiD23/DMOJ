package Controldequalitat;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean eChasis = sc.nextBoolean();
        boolean eRodes = sc.nextBoolean();
        boolean eMotor = sc.nextBoolean();
        boolean eElectronica = sc.nextBoolean();
        boolean eLlums= sc.nextBoolean();

        if (eChasis == true){
            System.out.println("L'estat del txasis es: correcte");
        }
        else{
            System.out.println("L'estat del txasis es: defectuos");
        }

        if (eRodes == true){
            System.out.println("L'estat de les rodes es: correcte");
        }
        else{
            System.out.println("L'estat de les rodes es: defectuos");
        }

        if (eMotor == true){
            System.out.println("L'estat del motor es: correcte");
        }
        else{
            System.out.println("L'estat del motor es: defectuos");
        }

        if (eElectronica == true){
            System.out.println("L'estat de l'electronica es: correcte");
        }
        else{
            System.out.println("L'estat de l'electronica es: defectuos");
        }

        if (eLlums == true){
            System.out.println("L'estat del llums es: correcte");
        }
        else{
            System.out.println("L'estat del llums es: defectuos");
        }

        if (eChasis && eElectronica && eMotor && eRodes && eLlums){
            System.out.println("L'estat general del cotxe es: correcte");
        }
        else{
            System.out.println("L'estat general del cotxe es: defectuos");
        }
    }
}
