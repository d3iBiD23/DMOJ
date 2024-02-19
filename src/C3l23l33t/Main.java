package C3l23l33t;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[] frase1 = sc.nextLine().split(" ");

        for (String palabra : frase1){
            char[] caracteres = palabra.toCharArray();

            if (frase1.equals("END")){
                System.out.println();
                break;
            }

            for (char c : caracteres){
                switch (c){
                    case 'A':
                        System.out.print('4');
                        break;
                    case 'b':
                        System.out.print('8');
                        break;
                    case 'e':
                        System.out.print('3');
                        break;
                    case 'g':
                        System.out.print('6');
                        break;
                    case 'i':
                        System.out.print('!');
                        break;
                    case 'l':
                        System.out.print('1');
                        break;
                    case 'm':
                        System.out.print("/\\/\\");
                        break;
                    case 'o':
                        System.out.print('0');
                        break;
                    case 's':
                        System.out.print('5');
                        break;
                    case 't':
                        System.out.print('7');
                        break;
                    case 'u':
                        System.out.print("|_|");
                        break;
                    case 'v':
                        System.out.print("\\\\/\\\\/");
                        break;
                    case 'w':
                        System.out.print("\\/\\/");
                        break;
                    case 'z':
                        System.out.print('2');
                        break;
                    default:
                        System.out.print(Character.isUpperCase(c) ? Character.toLowerCase(c) : c);
                }
            }
        }
    }
}
