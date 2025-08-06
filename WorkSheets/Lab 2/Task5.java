public class Task5 {
    public static void main (String[] args)
    {
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double length = Double.parseDouble(args[2]);
        
        double volume = height * width * length;

        System.out.println ("Volume of the cube is : " + volume);

    }
    
}
