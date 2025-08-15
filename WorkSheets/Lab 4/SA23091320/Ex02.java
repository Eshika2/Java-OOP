public class Ex02 {
    public static void main (String[] args)
    {
        int num1 = Integer.parseInt (args[0]);
        int num2 = Integer.parseInt (args[1]);

        if (num1 > num2)
            System.out.println("Minimum number is : " + num2);
        else
            System.out.println("Minimum number is : " + num1);

    }
}