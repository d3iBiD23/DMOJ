package D5d1ecreditcardcla;
import java.util.Scanner;

// escriu aqui el codi

class CreditCard{
    String holderName;
    long cardNumber;
    float accountBalance;
    float spendingLimit;
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard creditCard = new CreditCard();

        creditCard.holderName = scanner.nextLine();
        creditCard.cardNumber = scanner.nextLong();
        creditCard.accountBalance = scanner.nextFloat();
        creditCard.spendingLimit = scanner.nextFloat();

        System.out.println(creditCard.holderName.toUpperCase());
        System.out.println(String.valueOf(creditCard.cardNumber).replaceAll(".{4}","$0 "));
        System.out.println("Saldo: " + creditCard.accountBalance);
        System.out.println("Limit: " + creditCard.spendingLimit);
    }
}