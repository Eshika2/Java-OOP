public class Task4 {
    public static void main (String[] args)
    {
        int C = Integer.parseInt(args[0]);
        double F;

        F = 1.8 * C + 32;

        System.out.println ("Temperature on Celsius : " + C);
        System.out.println ("Temperature on Fahrenheit : " + F);

    }
}
