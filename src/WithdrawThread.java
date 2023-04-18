public class WithdrawThread implements Runnable {

    private CustomerAccount customerAccount;
    private int amount;

    public WithdrawThread(CustomerAccount customerAccount, int amount) {
        this.customerAccount = customerAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            this.customerAccount.withdraw(amount);
            int withdraw = this.customerAccount.getAmount();
            System.out.println("withdrawn: " + withdraw);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
