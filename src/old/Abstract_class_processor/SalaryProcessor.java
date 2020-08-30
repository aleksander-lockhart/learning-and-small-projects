package testing.kodilla;

public class SalaryProcessor extends SalaryPayout {

    public SalaryProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("sending money");
    }
}
