package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws Exception {
        if (amount > withdrawLimit) {
            throw new Exception("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new Exception("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}