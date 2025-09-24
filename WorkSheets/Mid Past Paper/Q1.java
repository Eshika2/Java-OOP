import java.util.Scanner;
public class Q1 {
    public static void main (String[] args) {
        String level;

        Scanner s = new Scanner (System.in);

        System.out.print ("Enter Inductance in Henries : ");
        double L = s.nextDouble();

        System.out.print ("Enter Capacitance in Farads : ");
        double C = s.nextDouble();

        float F = (float) genResonantFreq(L, C);

        float rounded = (float) (Math.round (F * 100) / 100d);

        System.out.println ("Resonant frequency in hertz : " + rounded);

        if ((F <= 1000) && (F >=301)) {
            level = "High";
        }
        else if ((F <= 300) && (F >= 101)) {
            level = "Medium";
        }
        else if ((F >= 0) && (F <= 100)) {
            level = "Low";
        }
        else {
            level = "";
        }

        System.out.println ("Level of Voltage change is " + level);

        s.close ();
    }
    public static double genResonantFreq (double L, double C) {
        float F;

        F = (float) (1 / (2 * 3.14 * Math.sqrt (L * C)));

        return F;
    }
}