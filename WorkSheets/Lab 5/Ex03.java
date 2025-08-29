import java.util.Scanner;
public class Ex03 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print ("Enter the Account Balance : ");
        double account_balance = s.nextDouble();

        double newBalance = calculate (account_balance);

        System.out.println ("New Balance is : " + newBalance);

        s.close();
    }

    public static double calculate (double account_balance) {
        double newBalance;
        if (account_balance > 50000) {
            newBalance = account_balance + account_balance * 0.08;
        }
        else if ((account_balance > 25000) && (account_balance <= 50000)) {
            newBalance = account_balance + account_balance * 0.05;
        }
        else if ((account_balance > 10000) && (account_balance <= 25000)) {
            newBalance = account_balance + account_balance * 0.02;
        }
        else {
            newBalance = account_balance;
        }

        return newBalance;
    }
}
