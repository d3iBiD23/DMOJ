package d1e2acontactclass;

import java.util.Scanner;

class Direccion {
    String calle;
    String codPostal;
    String ciudad;
    String provincia;
}

class Contacto {
    String nombre;
    String apellidos;
    Direccion direccion;
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contacto contacto = new Contacto();

        contacto.direccion = new Direccion();

        contacto.nombre = sc.nextLine();
        contacto.apellidos = sc.nextLine();

        contacto.direccion.calle = sc.nextLine();
        contacto.direccion.codPostal = sc.nextLine();
        contacto.direccion.ciudad = sc.nextLine();
        contacto.direccion.provincia = sc.nextLine();

        System.out.println(contacto.apellidos + ", " + contacto.nombre);
        System.out.println(contacto.direccion.calle);
        System.out.println(contacto.direccion.codPostal + " - " + contacto.direccion.ciudad);
        System.out.println(contacto.direccion.provincia);
    }
}
