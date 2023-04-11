package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(divide(a,b));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
//            System.out.println("This will always execute no matter of exception");
//        }

    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("You can't Divide by Zero");
        }
        return a/b;
    }
}
