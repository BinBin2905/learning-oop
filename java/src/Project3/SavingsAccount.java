package Project3;

public class SavingsAccount extends BankAccount{
    @Override
    public boolean debit(int amount) {
        if(amount > balance) return false;

        balance -= amount;
        return true;
    }

    @Override
    public void applyInterest() {
        if(balance <= 0) return;

        double interestAmount = balance * interestRate;
        balance += (int) interestAmount;

    }

    @Override
    public String accountInfo() {
        String info = "Type of Account : Savings\n";
        info += "Account ID      : " + getAccountID() + "\n";
        info += "Current Balance : $" + String.format("%.2f\n", (balance / 100.0));
        info += "Interest rate   : " + String.format("%.2f%%\n", (interestRate * 100));
        return info;
    }
}
