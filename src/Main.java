public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("123",1000D);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Initial Balance: " + bankAccount.getBalance());

        bankAccount.deposit(100D);
        System.out.println("Balance after deposit: " + bankAccount.getBalance());

        boolean withdrawalSuccess = bankAccount.withdraw(300.0);
        if (withdrawalSuccess) {
            System.out.println("Balance after withdrawal: " + bankAccount.getBalance());
        }


    }
}