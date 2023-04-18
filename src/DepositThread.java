public class DepositThread implements Runnable {

    private CustomerAccount customerAccount;
    private int amount;

    public DepositThread(CustomerAccount customerAccount, int amount) {
        this.customerAccount = customerAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        this.customerAccount.deposit(amount);
    }
}
