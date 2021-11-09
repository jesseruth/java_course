package uw.cp510.assignments.assignment3;

/**
 * BankAccount implements basic bank account features for assigment 3.
 *
 * @author Jesse Ruth
 */
public class BankAccount {
    private String name;
    private String type;
    private double balance;
    private double transactionFee = 5.00;

    /**
     * Update transaction fee
     * @param transactionFee amount
     */
    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    /**
     * @return Amount per transaction.
     */
    public double getTransactionFee() {
        return this.transactionFee;
    }

    /**
     * Set account name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get account name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Account type. Example: checking, savings.
     * @param type Account type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Type of bank account.
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Update account balance.
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Get account balance.
     * @return BankAccount balance.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Add amount to the account.
     * @param amount
     */
    public void deposit(double amount) {
        setBalance(amount + getBalance());
    }

    /**
     * Take amount from account. Will deduct transaction fee.
     * @param amount must be greater than 0
     */
    public void withDrawl(double amount) {
        if (getBalance() >= getTransactionFee() && amount > 0) {
            setBalance(getBalance() - amount - getTransactionFee());
        }
    }

    /**
     * This method will move money from one bank account type to another bank account. There is a $5.00 transfer fee
     * that is deducted from the current account's balance before any transfer can occur. This method will modify both
     * accounts as follows: "this" current object has its balances decreased by the given amount + $5 fee and other
     * accounts balance is increased by the given amount. If this account doesn't have enough money to transfer the
     * full amount, transfer whatever money is left after the $5 fee deduction. If the account has under $5 or the
     * amount is 0 or less, no transfer should happen and neither accounts state should be modified.
     * @param accountType The account we are transferring amount to.
     * @param amount The amount to transfer.
     */
    public void transfer(BankAccount accountType, double amount) {
        // only transfer if we can afford the fee
        if (getBalance() >= getTransactionFee() & amount > 0) {
            var remainder = getBalance() - (amount + getTransactionFee());
            if (remainder >= 0) {
                withDrawl(amount);
                accountType.deposit(amount);
            } else {
                var amountToTransfer = getBalance() - getTransactionFee();
                this.withDrawl(amountToTransfer);
                accountType.deposit(amountToTransfer);
            }
        }
    }

    /**
     * @return Account name, type, and balance.
     */
    public String toString() {
        return String.format("Account Name: %s, AccountType: %s, Balance %.6f", this.getName(), this.getType(), this.getBalance());
    }

    /**
     * BankAccount creates a basic account with a name and type.
     * @param name Name of account
     * @param type Type of account
     */
    public BankAccount(String name, String type) {
        this.setName(name);
        this.setType(type);
    }
}
