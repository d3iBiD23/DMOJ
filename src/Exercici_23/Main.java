package Exercici_23;
class Enter{
    public int valor;
}
class Operacions{
    public void incrementar(Enter x){
        x.valor++;
    }
}
public class Main {
    public static void main(String[] args) {
        Enter e = new Enter();
        e.valor = 10;
        e.valor++;
        System.out.println(e.valor);

        Operacions ops = new Operacions();
        ops.incrementar(e);
        System.out.println(e.valor);
    }
}