public class Ex1 {
    public static void main (String[] args)
    {
        int LKR = Integer.parseInt(args[0]);

        double Dollor = LKR / 129.26;
        double Pound = LKR / 129.26;
        double Euro = LKR / 206.36;

        System.out.println(LKR + " LKR = " + Dollor + "$");
        System.out.println(LKR + " LKR = " + Pound + " Pounds");
        System.out.println(LKR + " LKR = " + Euro + " Euros");

    }
}