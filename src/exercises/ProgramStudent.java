package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);
        Student  x = new Student();

        System.out.print("What is your name: ");
         x.name = sc.nextLine();
         x.grade1 = sc.nextDouble();
         x.grade2 = sc.nextDouble();
         x.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE =  %.2f%n" , x.finalGrade());

        if (x.approved()) {
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", x.missingPoints());
        }
       sc.close();
    }
}
