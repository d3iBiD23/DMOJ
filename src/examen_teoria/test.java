package examen_teoria;

class Modificador{
    public void incrementar(int valor){
        valor++;
    }
    public void decrementar(int valor){
        valor--;
    }
}

public class test {
    public static void main(String[] args) {
        Modificador m = new Modificador();
        int valor = 10;
        m.incrementar(valor);
        m.incrementar(valor);
        m.decrementar(valor);

        System.out.println(valor);
    }
}
