import java.util.Scanner;
public class Ex02 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print ("Enter the year : ");
        int year = s.nextInt();

        if ((year >= 1800) && (year <= 3000)) {
            if (year > 1584) {
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    System.out.println ("Year " + year + " is a leap year.");
                }
                else {
                    System.out.println ("Year " + year + " is not a leap year.");
                }
            }
            else {
                System.out.println ("Year " + year + " is not a leap year.");
            }
        }
        else {
            System.out.println ("INVALID YEAR !!!");
        }

        s.close();
    }
}
