public class Q2 {
    public static void main (String[] args) {
        String input = args[0];

        char s = (char) input.charAt(1);
        System.out.println (s);

        int x = input.length();
        System.out.println (x);

        int count = 0;

        int y = 0;
        while ( x > 0) {
            if (s == input.charAt(y)) {
                count++;
            }
            y++;
            x-=1;
        }

        System.out.println ("Secret Code is " + count);
        
    }
}
