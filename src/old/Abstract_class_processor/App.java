package testing.kodilla;

public class App {
    public static void main(String args[]) {
        EmployeeByTheItem employee = new EmployeeByTheItem(2, 1000);
        SalaryProcessor processor = new SalaryProcessor(employee);
        processor.processPayout();
    }
}
