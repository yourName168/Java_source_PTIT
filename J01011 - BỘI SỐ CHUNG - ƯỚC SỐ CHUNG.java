package coding;

import java.util.Scanner;

public class coding {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Hàm tìm bội chung nhỏ nhất (LCM) dựa trên GCD
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            long num1 = input.nextInt();

            long num2 = input.nextInt();

            long gcdResult = gcd(num1, num2);
            long lcmResult = lcm(num1, num2);

            System.out.println(lcmResult + " " + gcdResult);
            t--;
        }
    }

}
