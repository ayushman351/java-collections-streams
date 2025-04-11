package BankTransactionSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.setBalance(10000);

        try{
            account.withdraw(-100000);
        }catch (IllegalArgumentException | InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
