package testing.kodilla;

public class EmployeeByTheItem implements Employee{

    private double itemCount;
    private double salary;

    public EmployeeByTheItem(double itemCount, double salary) {
        this.itemCount = itemCount;
        this.salary = salary;
    }

    public double getItemCount() {
        return itemCount;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return itemCount * salary;
    }
}
