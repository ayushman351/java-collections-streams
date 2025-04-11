import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first value: ");
        int first=in.nextInt();
        System.out.println("Enter second value: ");
        int second=in.nextInt();

        try{
            System.out.println("Division: "+first/second);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }

    }
}
