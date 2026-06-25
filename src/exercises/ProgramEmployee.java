package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee x = new Employee();

        System.out.print("Name: " );
        x.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();
        System.out.println("Employee: " +x);

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double valor = sc.nextDouble();
        x.increaseSalary(valor);

        System.out.println();

        System.out.println("Updated data: " +x);
        sc.close();
    }
}
