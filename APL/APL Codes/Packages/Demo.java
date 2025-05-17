import java.util.Scanner;

import mypackage.mymath.*;
import mypackage.mymath.special.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int a = 0,b = 0;

        while (true) {
            System.out.println("\n\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Armstrong Number");
            System.out.println("6. Factorial");
            System.out.println("7. Fibonacci");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:

                    Addition ad = new Addition();

                    System.out.print("Enter 1st Number: ");
                    a = sc.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    b = sc.nextInt();
                    System.out.print("Addition is: " + ad.add(a,b));

                    break;
                
                case 2:
                    Subtraction sb = new Subtraction();

                    System.out.print("Enter 1st Number: ");
                    a = sc.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    b = sc.nextInt();
                    System.out.print("Subtraction is: " + sb.sub(a,b));
                    
                    break;

                case 3:
                    Multiplication mul = new Multiplication();

                    System.out.print("Enter 1st Number: ");
                    a = sc.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    b = sc.nextInt();
                    System.out.print("Multiplication is: " + mul.multiply(a,b));
                    break;
                
                case 4:
                    Division dv = new Division();

                    System.out.print("Enter 1st Number: ");
                    a = sc.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    b = sc.nextInt();
                    System.out.print("Division is: " + dv.div(a,b));
                    break;

                case 5:
                    Armstrong arm = new Armstrong();

                    System.out.print("Enter Limit: ");
                    int limit = sc.nextInt();
                    System.out.print("Armstrong no. are: ");
                    arm.armstr(limit);
                    break;

                case 6:
                    Factorial ft = new Factorial();

                    System.out.print("Enter Number: ");
                    a = sc.nextInt();
                    System.out.print("Factorial is: " + ft.fact(a));
                    break;

                case 7:
                    Fibonacci fb = new Fibonacci();

                    System.out.print("Enter Limit: ");
                    int lim = sc.nextInt();
                    System.out.print("Fibonacci series is: ");
                    fb.fibo(lim);
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    System.err.println("Enter valid input");
                    continue;
            }
        }
    }
}
