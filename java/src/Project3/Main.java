package Project3;


public class Main {
    public static void main(String[] args) {
        // Create an instance of TestAccount, a derived class of BankAccount
        TestAccount testAccount = new TestAccount();

        // Set account ID and interest rate for the test account
        testAccount.setAccountID("1234-5678-9012-3456");
        testAccount.setInterestRate(0.02);

        // Credit 1000 pennies (i.e., $10.00) to the test account
        testAccount.credit(1000);

        // Debit 500 pennies (i.e., $5.00) from the test account
        testAccount.debit(500);

        // Apply interest to the test account based on the interest rate
        testAccount.applyInterest();

        // Display the account information
        System.out.println("\n" + testAccount.accountInfo());


        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();

        // Set the account ID and interest rate
        savingsAccount.setAccountID("1111-2222-3333-4444");
        savingsAccount.setInterestRate(0.015); // 1.5%

        // Credit and debit some amounts
        savingsAccount.credit(1000);
        savingsAccount.debit(500);

        // Apply interest and display account information
        savingsAccount.applyInterest();
        System.out.println("\n" + savingsAccount.accountInfo());

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount();

        // Set the account ID, interest rate, and overdraft fee
        checkingAccount.setAccountID("1111-2222-3333-4444");
        checkingAccount.setInterestRate(0.015); // 1.5%
        checkingAccount.setFee(2000); // $20.00

        // Credit and debit some amounts
        checkingAccount.credit(1000);
        checkingAccount.debit(1500);

        // Apply interest and display account information
        checkingAccount.applyInterest();
        System.out.println("\n" + checkingAccount.accountInfo());

        CreditcardAccount creditcardAccount = new CreditcardAccount();

        // Setting account-specific details for the CreditcardAccount object
        creditcardAccount.setAccountID("9999-0000-1111-2222"); // Setting the unique account ID
        creditcardAccount.setInterestRate(0.015); // Setting the interest rate (as a decimal, 1.5% in this case)
        creditcardAccount.setLimit(1000000); // Setting the credit limit in cents (e.g., $10,000.00)

        // Performing some transactions on the credit card account
        creditcardAccount.credit(5000); // Crediting $50.00 to the account balance
        creditcardAccount.debit(2000); // Debiting $20.00 from the account balance

        // Applying interest to the account balance (if applicable)
        creditcardAccount.applyInterest();

        // Printing account information
        System.out.println("\n" + creditcardAccount.accountInfo());


        System.out.println("Number of accounts:" + BankAccount.countAccounts);
    }
}