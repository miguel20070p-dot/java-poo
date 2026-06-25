package exercises;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage) {
        double increase = grossSalary  * percentage /100;
        this.grossSalary += increase;
    }
    public String toString() {
        return name
                +", $ "
                +String.format("%.2f" ,netSalary() );
    }
}
