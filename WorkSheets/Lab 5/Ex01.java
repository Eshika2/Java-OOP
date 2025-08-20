import java.util.Scanner;
public class Ex01 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print ("Enter the marks : ");
        double mark = s.nextDouble();

        String grade;
        if ((mark >= 80) && (mark <= 100)) {
            grade = "Distinction";
        }    
        else if ((mark >= 60) && (mark <= 79)) {
            grade = "Honors";
        }
        else if ((mark >= 50) && (mark <= 59)) {
            grade = "Merit";
        }
        else if ((mark >= 40) && (mark <= 49)) {
            grade = "Pass";
        }
        else if ((mark >= 0) && (mark <= 39)) {
            grade = "Fail";
        }
        else {
            grade = "Invalid value Entered";
        }

        System.out.println ("Entered Marks : " + mark + "\tGrade : " + grade);
        s.close();
    }
}