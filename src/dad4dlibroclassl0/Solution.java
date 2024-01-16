package dad4dlibroclassl0;

import java.util.Scanner;

class Libro{
    Autor autor;
    String titulo;
    String ISBN;
    float rating;
}
class Autor{
    String nombre;
    float rating;
}
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro = new Libro();

        libro.autor = new Autor();

        libro.titulo = scanner.nextLine();
        libro.ISBN = scanner.nextLine();
        libro.rating = Float.parseFloat(scanner.next());
        scanner.nextLine();
        libro.autor.nombre = scanner.nextLine();
        libro.autor.rating = (scanner.nextFloat());

        System.out.println(libro.ISBN);
        System.out.println(libro.titulo);
        System.out.println(new String(new char[(int)libro.rating]).replace("\0","*"));
        System.out.println(libro.autor.nombre);
        System.out.println(new String(new char[(int)libro.autor.rating]).replace("\0","*"));

    }
}
