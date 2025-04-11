public class ExceptionPropagation2 {
    public  static void method1(){                // method1 throws exception
        throw new ArithmeticException("error");
    }

    public static void method2(){
        method1();                                 // exception propagates to method2
    }

    public static void main(String[] args) {
        try
        {
         method2();                                                 // exception propagates to main method and handled
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Exception handled in main");
        }
    }
}
