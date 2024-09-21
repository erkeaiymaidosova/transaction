import java.util.ArrayList;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber,String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.transactions = new ArrayList<>();
        this.balance=0.0;
    }

    public void deposit(double amount) {
        balance+=amount;
        Amount depositTransaction=new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(depositTransaction);
    }
    public void withdrawal(double amount){
        if(amount<=balance){
            balance-=amount;
            Amount withdrawalTransaction=new Amount(amount,TransactionType.WITHDRAWAL);
            transactions.add(withdrawalTransaction);
        }else{
            System.out.println("Balance is insufficient");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void transactionHistory(){
        if(transactions.isEmpty()){
            System.out.println("No transaction found");
        }else{
            for(Amount transaction:transactions){
                TransactionType type= transaction.getTransactionType();
                double amount= transaction.getAmount();
                System.out.println("Transaction type: " + type + "   Amount of transaction: " + amount);
            }

        }

    }
}
