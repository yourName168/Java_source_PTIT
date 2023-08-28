package coding;

import java.util.Scanner;

public class coding {

    static long[] A = new long[95];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A[0] = 0;
        A[1] = 1;
        for (int i = 2; i < 95; i++) {
            A[i] = A[i - 1] + A[i - 2];
        }
        int t = input.nextInt();
        while (t > 0) {
            int n = input.nextInt();
            long pos = input.nextLong();
            if (P(n, pos) == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
            t--;
        }
    }

    public static int P(int n, long pos) {
        if (n <= 2) {
            return n;
        } else {
            if (pos > A[n - 2]) {
                return P(n - 1, pos - A[n - 2]);
            } else {
                return P(n - 2, pos);
            }
        }
    }

}
