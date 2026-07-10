package exceptionHandling;

public class exceptionn {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        
        try {
            divide(a, b);
            // int c = a/b;
            
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
                        //or
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always excecute");
        }
        
        
    }
    static int divide(int a, int b) throws ArithmeticException{// it may or may not throws an exception
        if (b==0) {
            throw new ArithmeticException("You can not divide by 0");//return the exception if there is error
        }
        return a/b;
    }
}
