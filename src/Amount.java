public class Amount {
    private double amount;
    private TransactionType transactionType;

    // Constructor to initialize the amount and transaction type
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
        System.out.println("Craated amount: " +  this);
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transaction: " + transactionType + ", Amount: " + amount;
    }
}
