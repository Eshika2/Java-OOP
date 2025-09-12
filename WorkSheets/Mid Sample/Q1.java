import java.util.Scanner;
public class Q1 {
    public static void main (String[] args) {
        String category;

        Scanner s = new Scanner (System.in);

        System.out.print ("Enter molar mass of the gas in kilograms per mole : ");
        double M = s.nextDouble();

        System.out.print ("Enter the temperature in kelvin : ");
        double T = s.nextDouble();

        double Vp = calculateMSpeed(M, T);

        System.out.println ("Root-mean-square speed of gas molecule : " + Vp);
        
        float rounded = (float) (Math.round (Vp * 100) / 100d);
        System.out.println ("Rounded answer : " + rounded);

        if (Vp >= 1001) {
            category = "Fast";
        }
        else if (Vp >= 501) {
            category = "Medium";
        }
        else if (Vp >= 0) {
            category = "Slow";
        }
        else {
            category = "";
        }

        System.out.println ("Category of the Speed : " + category);

        s.close();
    }

    public static float calculateMSpeed (double M, double T) {
        float Vp;
        double R = 8.3144598;
        Vp = (float) (Math.sqrt ((3 * R * T) / M) * 10 * 10 * 10);

        return Vp;
    }
}