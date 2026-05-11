package Project3;

import java.text.DecimalFormat;

public class CreditcardAccount extends BankAccount{
    private int limit = 0;

    @Override
    public boolean debit(int amount) {
        if (balance - amount >= -limit) {
            balance -= amount; // Deduct the amount from the account balance
            return true; // Return true to indicate that the transaction was successful
        }
        return false;
    }

    @Override
    public void applyInterest() {
        if (balance < 0) {
            // Calculate interest amount based on the negative balance and the interest rate
            double interestAmount = balance * getInterestRate();
            balance += (int) interestAmount; // Convert and add the interest amount to the account balance
        }
    }

    @Override
    public String accountInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // Format currency values
        String formattedBalance = decimalFormat.format(Math.abs((double) balance) / 100); // Format the account balance
        String formattedInterestRate = decimalFormat.format(getInterestRate() * 100); // Format the interest rate as a percentage

        // Construct and return the account information string
        return "Type of Account : Creditcard\n" +
                "Account ID      : " + getAccountID() + "\n" +
                "Current Balance : $" + formattedBalance + "\n" +
                "Interest rate   : " + formattedInterestRate + "%\n" +
                "Credit Limit    : $" + decimalFormat.format((double) limit / 100);
    }

    public void setLimit(int limit){
        this.limit = limit;
    };
    public int getLimit(){
        return this.limit;
    };
}
