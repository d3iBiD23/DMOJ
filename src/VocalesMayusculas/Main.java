package VocalesMayusculas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (sc.hasNextLine()){
            String frase = sc.nextLine();

            if (frase.equals("END")){
                break;
            }

            char[] array = frase.toCharArray();
            for (char c : array){
                switch (c){
                    case 'a':
                        c = 'A';
                        break;
                    case 'e':
                        c = 'E';
                        break;
                    case 'i':
                        c = 'I';
                        break;
                    case 'o':
                        c = 'O';
                        break;
                    case 'u':
                        c = 'U';
                        break;
                }
                System.out.print(c);
            }

            if (!frase.equals("END")){
                System.out.println();;
            }
        }
        sc.close();
    }
}
