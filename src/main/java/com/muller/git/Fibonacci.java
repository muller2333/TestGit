package com.muller.git;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("1111111");
        long date1 = System.currentTimeMillis();
        int res = fibonacci(40);
        long date2 = System.currentTimeMillis();
        System.out.println(date2 - date1);
    }

    public static int fibonacci(int n) {
        if (n == 2 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}