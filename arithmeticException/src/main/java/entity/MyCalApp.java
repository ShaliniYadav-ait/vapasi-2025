package entity;

import java.util.Scanner;

public class MyCalApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide the age to be converted to the type double : ");
        int num = s.nextInt();
        callException(c,num);
    }

    private static void callException(Calculator c, int n) {
        System.out.println("New value of age is " +  c.caldouble(n));
    }
}
