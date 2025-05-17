package mypackage.mymath.special;

public class Fibonacci {
    public void fibo(int n) {
        int a = -1, b = 1;

        for (int i = 0; i < n; i++) {
            int c = a + b;
            System.out.print(c+", ");
            a = b;
            b = c;
        }

        System.out.println("");
    }
}
