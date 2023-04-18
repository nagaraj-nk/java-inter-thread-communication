public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomerAccount customerAccount = new CustomerAccount(500);
        WithdrawThread withdrawThread = new WithdrawThread(customerAccount, 1000);
        Thread withdraw = new Thread(withdrawThread);
        DepositThread depositThread = new DepositThread(customerAccount, 2000);
        Thread deposit = new Thread(depositThread);

        withdraw.start();
        Thread.sleep(2000);
        deposit.start();
    }
}