import java.util.Scanner;
public class Ex3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Item Name : ");
        String item = scanner.nextLine();

        System.out.println("Enter the Unit Price : ");
        Integer price = scanner.nextInt();

        System.out.println("Enter the Quantity : ");
        Integer quantity = scanner.nextInt();

        System.out.println("Total cost will be " + price * quantity + " rupees.");
        
    }
}
