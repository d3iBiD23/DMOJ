package C1l23rellotgedemanil;

import java.util.Locale;
import java.util.Scanner;

class Relotge {
    private float grausSegons;
    private float grausMinuts;
    private float grausHores;

    public Relotge(int hores, int minuts, int segons) {
        this.grausSegons = segons * 6.0f;
        this.grausMinuts = (minuts * 6.0f) + (segons * 0.1f);
        this.grausHores = (hores * 30.0f) + (minuts * 0.5f) + (segons * (0.5f / 60.0f));
    }

    public void avancaSegon() {
        grausSegons = (grausSegons + 6) % 360;
        grausMinuts = (grausMinuts + (6 / 60.0f)) % 360;
        grausHores = (grausHores + (6 / 360.0f)) % 360;
    }

    public Relotge avancaTemps(int segons) {
        return segons > 0 ? avancaSegonChaining().avancaTemps(segons - 1) : this;
    }

    private Relotge avancaSegonChaining() {
        return this;
    }

    public double getGrausSegons() {
        return grausSegons;
    }

    public double getGrausMinuts() {
        return grausMinuts;
    }

    public double getGrausHores() {
        return grausHores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Donat el input: 2 30 0
        Relotge rellotge = new Relotge(sc.nextInt(), sc.nextInt(), sc.nextInt());

        // Avançar el temps 5 segons sense cap bucle ni condicional
        rellotge.avancaTemps(5).avancaTemps(0).avancaTemps(0);

        // Output esperat: 75.0 180.0 0.0
        System.out.println(rellotge.getGrausHores());
        System.out.println(rellotge.getGrausMinuts());
        System.out.println(rellotge.getGrausSegons());
    }
}

