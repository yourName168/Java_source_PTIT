package coding;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long[] A = new long[95];
            A[0] = 0;
            A[1] = 1;
            for (int i = 2; i < 95; i++) {
                A[i] = A[i - 1] + A[i - 2];
            }
            int t = scanner.nextInt();
            while (t > 0) {
                long n = scanner.nextLong();
                if (Arrays.binarySearch(A, n) < 0) {
                    System.out.println("NO\n");
                    t--;
                    continue;
                }
                System.out.println("YES\n");
                t--;
            }
        } // Chiều cao của tam giác cân
    }
}