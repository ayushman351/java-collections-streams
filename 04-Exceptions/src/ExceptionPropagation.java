import java.util.Scanner;

public class ExceptionPropagation {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount=in.nextDouble();
        System.out.print("Enter rate: ");
        double rate=in.nextDouble();
        System.out.print("Enter Years: ");
        int years=in.nextInt();

        try{
            double interest=calculateInterest(amount,rate,years);
            System.out.println("Interest: "+interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Program did not crash");


    }

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount<=0||rate<=0||years<=0){
            throw  new IllegalArgumentException("Invalid Input: amount,rate and years must be positive");
        }
        return (amount*rate*years)/100;
    }

}
