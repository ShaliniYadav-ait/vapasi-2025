package arithmaticexception;

public class MyCalcApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        callException(c,-1);
        callException(c,0);
        callException(c,2);
    }

    private static void callException(Calculator c, int n) {
        try {
          double  convertedDouble =  c.caldouble(n);
          System.out.println("New value of n is " + convertedDouble);
        }catch (MyArithException e){
            System.out.println("Caught invalid age exception with message - " + e.getMessage() );
        }
    }
}
