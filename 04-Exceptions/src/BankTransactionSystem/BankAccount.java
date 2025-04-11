package BankTransactionSystem;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public  void withdraw(double amount)throws InsufficientBalanceException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount");
        }else if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance in your account");
        }else{
            balance-=amount;
            System.out.println("Withdrawal successful, new balance: "+balance);
        }
    }
}
