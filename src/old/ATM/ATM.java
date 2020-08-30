package testing.kodilla;

abstract class ATMMain {

    public void enterCard() {
        System.out.println("Please enter card");
    }

    public void enterPIN() {
        System.out.println("Enter PIN");
    }

    public void complyQithdraw() {
        System.out.println("how much to withdraw");
    }

    abstract protected void gotInfo();
    abstract protected void checkBalance();
    abstract protected void provideMoney();

    public void withdrawCash() {
        System.out.println("Withdrawing cash");
    }

    public void runAtm() {
        this.enterCard();
        this.enterPIN();
        this.complyQithdraw();
        this.gotInfo();
        this.checkBalance();
        this.provideMoney();
        this.withdrawCash();
    }

}

class ATMUser extends ATMMain {
    protected void gotInfo() {
        System.out.println("checking balance");
    }
    protected void checkBalance() {
        System.out.println("Checking accout");
    }
    protected void provideMoney() {
        System.out.println("Wihdrawing");
    }
}

class App {

public static void main(String args[]) {

    ATMUser atm = new ATMUser();
    atm.runAtm();
    }
}
