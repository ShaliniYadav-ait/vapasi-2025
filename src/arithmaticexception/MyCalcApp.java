package arithmaticexception;

import java.util.Scanner;

public class MyCalcApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide the number to be converted to double : ");
        int num = s.nextInt();
        callException(c,num);
    }

    private static void callException(Calculator c, int n) {
          System.out.println("New value of n is " +  c.caldouble(n));
    }
}
