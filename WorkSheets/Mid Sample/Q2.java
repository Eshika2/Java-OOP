public class Q2 {
    public static void main (String[] args) {

        String msg = args[0];
        int num = Integer.parseInt(args[1]);

        System.out.println ("Greeting Message :" + msg);
        System.out.println ("Number of repitition :" + num);

        while (num > 0)
        {
            System.out.println (msg);
            num-=1;
        }

        

    }
    
}
