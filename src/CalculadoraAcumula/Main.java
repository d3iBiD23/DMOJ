package CalculadoraAcumula;

import java.util.Locale;
import java.util.Scanner;

class Calculadora{
    private float acc = 0.0f;

    public float getAcc() {
        return this.acc;
    }

    public float suma(float numero){
        return this.acc += numero;
    }
    public float resta(float numero){
        return this.acc -= numero;
    }
    public float multi(float numero){
        return this.acc *= numero;
    }
    public float divisio(float numero){
        return this.acc /= numero;
    }
    public Calculadora() {
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Calculadora calc = new Calculadora();

        String operador = sc.next();

        if (operador.equals("END")){
            System.out.println(calc.getAcc());
        }

        while (!operador.equals("END")){
            float operand = sc.nextFloat();

            switch (operador){
                case "+":
                    calc.suma(operand);
                    break;
                case "-":
                    calc.resta(operand);
                    break;
                case "*":
                    calc.multi(operand);
                    break;
                case "/":
                    calc.divisio(operand);
                    break;
            }
            System.out.println(calc.getAcc());
            operador = sc.next();
        }
    }
}
