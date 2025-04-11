import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={50,43,83,99,100};
        System.out.println("Enter divisor: ");
        int divisor= in.nextInt();
        System.out.println("Enter the index of dividend");
        int index=in.nextInt();

        try{
            try {
                System.out.println("result: "+arr[index]/divisor);
            }catch (ArithmeticException e){
                System.out.println("Error: division by zero");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }

    }
}
