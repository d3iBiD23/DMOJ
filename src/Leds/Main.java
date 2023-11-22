package Leds;

class Led {
    boolean state;
    public void switchOn(){
        this.state = true;
    }
    public void switchOff(){
        this.state = false;
    }
    void draw(){
        if(state){
            System.out.print("(*)");
        } else {
            System.out.print("( )");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Led l1 = new Led();
        Led l2 = new Led();

        l1.draw();
        l2.draw();

        l1.switchOn();

        System.out.println();
        l1.draw();
        l2.draw();

        l2.switchOn();

        System.out.println();
        l1.draw();
        l2.draw();

        l1.switchOff();

        System.out.println();
        l1.draw();
        l2.draw();
    }
}
