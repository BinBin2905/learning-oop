package Project3;

public class TestAccount extends BankAccount{
    @Override
    public boolean debit(int pennies) {
        this.balance -= pennies;
        return true;
    }

    @Override
    public void applyInterest() {
        this.balance += (int) (this.interestRate * this.balance);
    }

    @Override
    public String accountInfo() {
        return "TestAccount with Balance = " + String.format("$%.2f\n", (this.balance / 100.0));
    }
}
