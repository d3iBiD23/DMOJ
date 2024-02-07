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
        switch (orientacio){
            case 'N':
                orientacio = 'E';
                break;
            case 'E':
                orientacio = 'S';
                break;
            case 'S':
                orientacio = 'W';
                break;
            case 'W':
                orientacio = 'N';
                break;
        }
    }
    public void girEsq(){
        switch (orientacio) {
            case 'N':
                orientacio = 'W';
                break;
            case 'E':
                orientacio = 'N';
                break;
            case 'S':
                orientacio = 'E';
                break;
            case 'W':
                orientacio = 'S';
                break;
        }
    }
    public void endavant(){
        switch (orientacio) {
            case 'N':
                coordY++;
                break;
            case 'E':
                coordX++;
                break;
            case 'S':
                coordY--;
                break;
            case 'W':
                coordX--;
                break;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x = sc.nextInt();

        int y = sc.nextInt();

        char orientacio = sc.next().charAt(0);

        String ordre = sc.next();

        Robot r = new Robot(x, y, orientacio);

        procesarInstruccions(r, ordre);

        System.out.println("{" + r.getCoordX() + ", " + r.getCoordY() + "}");
        System.out.println(r.getOrientacio());

        sc.close();
    }

    public static void procesarInstruccions(Robot r, String ordre) {
        for (char instruction : ordre.toCharArray()) {
            if (instruction == 'A') {
                r.endavant();
            } else if (instruction == 'R') {
                r.girDreta();  // Use girDreta() for 'R'
            } else if (instruction == 'L') {
                r.girEsq();  // Use girEsq() for 'L'
            }
        }
    }
}
