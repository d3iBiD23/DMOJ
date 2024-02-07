package C3l31robotsimula;

import java.util.Locale;
import java.util.Scanner;

class Robot{
    private int coordX;
    private int coordY;
    private char orientacio;

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public char getOrientacio() {
        return orientacio;
    }

    public Robot(int coordX, int coordY, char orientacio) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.orientacio = orientacio;
    }
    public void girDreta(){

    }
    public void girEsq(){

    }
    public void endavant(){

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x = sc.nextInt();

        int y = sc.nextInt();

        char orientacio = sc.next().charAt(0);

        String ordre = sc.nextLine();

        Robot r = new Robot(x, y, orientacio);


    }
}
