public class Ex05 {
    public static void main (String[] args) {

        Ex05 generate = new Ex05 ();
        generate.genRandom ();

    }
    
    public static void genRandom () {

        for (int i=0 ; i<5 ; ++i) {
            System.out.println ((int)(Math.random () * 100 ));
        }
    }
}
