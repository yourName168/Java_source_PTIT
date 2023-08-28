package coding;

import java.util.Scanner;

public class coding {

    public static long m = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = 1, b = 1;
        while (true) {
            a = input.nextInt();
            b = input.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(luyThua(a, b));
        }
    }

    public static long luyThua(long a, long b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }

        long x = luyThua(a, b / 2);
        if (b % 2 == 0) {
            return (x * x) % m;
        } else {
            return ((x * x) % m * a) % m;
        }
    }
}
