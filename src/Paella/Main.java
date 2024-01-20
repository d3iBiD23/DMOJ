package Paella;

import java.util.Locale;
import java.util.Scanner;

class Paella {
    public final float proporcioArroz;
    public final float proporcioGamba;
    private int comensales;
    private float precioKArroz;
    private float precioKGamba;

    public Paella(int comensales, float precioKArroz, float precioKGamba) {
        this.comensales = comensales;
        this.precioKArroz = precioKArroz;
        this.precioKGamba = precioKGamba;

        this.proporcioArroz = 4.0f / 0.5f;
        this.proporcioGamba = 4.0f / 0.25f;
    }

    public String calcularInfo() {
        float cantidadArroz = comensales / proporcioArroz;
        float cantidadGamba = comensales / proporcioGamba;
        float costeArroz = cantidadArroz * precioKArroz;
        float costeGamba = cantidadGamba * precioKGamba;
        float costeTotal = costeArroz + costeGamba;

        String formatoArroz = cantidadArroz % 1 == 0 ? "%.1f" : "%.2f";
        String formatoGamba = cantidadGamba % 1 == 0 ? "%.1f" : "%.2f";
        String formatoEuros = costeTotal % 1 == 0 ? "%.1f" : "%.2f";

        return String.format(Locale.US,
                formatoArroz + " kg arros\n" + formatoGamba + " kg gambes\n" +
                        formatoEuros + " euros arros\n" + formatoEuros + " euros gambes\nTOTAL: " + formatoEuros + " euros",
                cantidadArroz, cantidadGamba, costeArroz, costeGamba, costeTotal);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Paella p = new Paella(sc.nextInt(), sc.nextFloat(), sc.nextFloat());

        System.out.println(p.calcularInfo());

        sc.close();
    }
}