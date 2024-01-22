package Estudi_exam;
class Calculadora{
    private boolean overflow;
    public float suma(float num1, float num2){
        float resultat = num1 + num2;
        return resultat;
    }
    public float resta(float num1, float num2){
        float resultat = num1 - num2;
        return resultat;
    }
}
public class Test {
    public static void main(String[] args) {
        float a = 12.4f;
        float b = 3.25f;

        Calculadora c = new Calculadora();
        System.out.println(a + " + " + b + " = " + c.suma(a, b));
        System.out.println(a + " - " + b + " = " + c.resta(a, b));
    }
}
