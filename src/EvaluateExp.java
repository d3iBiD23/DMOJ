import java.util.Locale;
import java.util.Scanner;

public class EvaluateExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String exp = sc.nextLine();

        System.out.println(evaluateExp(exp));
    }
    private static int evaluateExp(String exp){
        int ultimaSuma = exp.lastIndexOf("+");
        int ultimaMulti = exp.lastIndexOf("*");

        if (ultimaSuma == -1 && ultimaMulti == -1){
            // CAS BASE, exp és un nombre enter
            return Integer.parseInt(exp);

        } else if (ultimaSuma >= 0){
            String left = exp.substring(0, ultimaSuma);
            String right = exp.substring(ultimaSuma+1);

            return evaluateExp(left) + evaluateExp(right);
        } else {
            String left = exp.substring(0, ultimaMulti);
            String right = exp.substring(ultimaMulti+1);

            return evaluateExp(left) * evaluateExp(right);
        }
    }
}