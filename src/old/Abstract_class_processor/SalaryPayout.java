package testing.kodilla;

abstract class SalaryPayout {

    public Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Processing for: " + employee.calculateSalary());
        this.payout();
        System.out.println("Completed");
    }

}
