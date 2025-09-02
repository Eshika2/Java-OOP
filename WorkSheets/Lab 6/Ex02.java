import java.util.Scanner;
public class Ex02 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        
        do {



            System.out.print ("Do you want to continue (Y/N) :");
            char a = s.next().charAt(0);
        }
        while ((a == 'n') || (a == 'N'));

        s.close();
    }
}
