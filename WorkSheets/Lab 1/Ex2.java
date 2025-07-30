public class Ex2 {
    
    public static void main (String[] args)
    {
        System.out.println ("* * * *            *");
        System.out.println ("* * * *           * *");
        System.out.println ("* * * *          * * *");
        System.out.println ("* * * *         * * * *");

        System.out.println();

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(" ");
            }
            for(int k=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
