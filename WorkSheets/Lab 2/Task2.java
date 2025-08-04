public class Task2 {
    public static void main (String[] args)
    {
        int miles = 26;
        int yards = 385;
        double kilometers;

        final double mConstant = 1.609;
        final double yConstant = 1760.0;

        kilometers = ((miles * mConstant) +(mConstant / yConstant)*yards);
        
        System.out.println ("Distance in Kilometers : " + kilometers + "km");

    }
}
