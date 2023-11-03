package GosGat;
class Gos {
    public void lladrar(){

        System.out.println("Guau, guau");
    }
}

class Gat {
    public void miolar(){

        System.out.println("Miau, miau");
    }
}
public class Main {
    public static void main(String[] args) {
            Gos gos = new Gos();
            Gat gat = new Gat();

            gos.lladrar();
            gat.miolar();
        }
}