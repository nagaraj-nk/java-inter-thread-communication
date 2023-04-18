public class CustomerAccount {

    private int amount;

    public CustomerAccount(int amount) {
        this.amount = amount;
    }

    public synchronized void deposit(int amount) {
        this.amount = this.amount + amount;
        System.out.println("deposit successful. net amount=" + this.amount);
        notify();
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        if (this.amount < amount) {
            System.out.println("insufficient funds, waiting for deposit");
            wait();
        }
        this.amount = this.amount - amount;
        System.out.println("transaction success. remaining balance=" + this.amount);
    }

    public int getAmount() {
        return this.amount;
    }
}
