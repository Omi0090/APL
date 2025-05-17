package mypackage.mymath.special;

public class Armstrong {
    public void armstr(int limit) {
        for (int i = 1; i <= limit; i++) {
            int sum = 0;
            int temp = i;
            int digits = String.valueOf(i).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }
}
