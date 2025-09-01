import java.util.Scanner;
public class Ex04 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        double[] realNumbers = new double [3];

        for (int i=0 ; i<realNumbers.length ; i++) {
            System.out.print ("Please enter a number OR type 'EXIT' to leave : ");

            String value = s.nextLine();

            if (value.equalsIgnoreCase("Exit")) {
                break;
            }
            realNumbers[i] = Double.parseDouble(value);
        }

        System.out.println ("Mean : " + calculateMean (realNumbers));

        s.close ();
    }

    static double calculateMean (double[] realNum) {
        double sum = 0;

        for (int i = 0 ; i < realNum.length ; i++) {
            sum += realNum[i];
        }

        return sum / realNum.length;
    }

}
