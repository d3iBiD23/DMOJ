package e679denemyclassl0;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Enemy{
    Health health;
    Weapon weapon;
    public Enemy(String nom) {
        if (nom.equals("guerrero")) {
            this.health = new Health(50);
            this.weapon = new Weapon(60);
        } else if (nom.equals("amazona")) {
            this.health = new Health(40);
            this.weapon = new Weapon(70);
        } else if (nom.equals("brujo")) {
            this.health = new Health(30);
            this.weapon = new Weapon(80);
        }
    }
}
class Health{
    int value;
    int max;
    public Health(int initialValue) {
        this.value = initialValue;
        this.max = initialValue;
    }
}
class Weapon{
    int value;
    int max;
    public Weapon(int initialValue) {
        this.value = initialValue;
        this.max = initialValue;
    }
}


public class Solution {
    public static void main(String[] args) {

        Enemy guerrero = new Enemy("guerrero");
        Enemy amazona = new Enemy("amazona");
        Enemy brujo = new Enemy("brujo");

        System.out.println("GUERRERO  " +
                "Health: " + guerrero.health.value + "/" + guerrero.health.max + "   " +
                "Weapon: " + guerrero.weapon.value + "/" + guerrero.weapon.max);

        System.out.println("AMAZONA   " +
                "Health: " + amazona.health.value + "/" + amazona.health.max + "   " +
                "Weapon: " + amazona.weapon.value + "/" + amazona.weapon.max);

        System.out.println("BRUJO     " +
                "Health: " + brujo.health.value + "/" + brujo.health.max + "   " +
                "Weapon: " + brujo.weapon.value + "/" + brujo.weapon.max);
    }
}
