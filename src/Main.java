public class Main {
    public static void main(String[] args) {
        PersonalAccount person1=new PersonalAccount(12345,"silvi",1345.87);
        person1.deposit(300);
        person1.withdrawal(120);
        person1.transactionHistory();
        System.out.println("Account Holder: " + person1.getAccountHolder());
    }
}