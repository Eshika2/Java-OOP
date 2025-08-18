import java.util.Scanner;
public class Ex06 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter the month of the year in numbers : ");
        int month = scanner.nextInt ();

        if ((month == 1)||(month == 2)||(month == 12))
            System.out.println ("December to February  		Winter");
        else if ((month == 3)||(month == 4)||(month == 5))
            System.out.println ("March to May 			Spring");
        else if ((month == 6)||(month == 7)||(month == 8))
            System.out.println ("June to August  			Summer");
        else if ((month == 9)||(month == 10)||(month == 11))
            System.out.println ("September to November  	Autumn");
        else 
        {
            System.out.println ("WRONG MONTH NUMBER!!!!!");
        }
    }
}