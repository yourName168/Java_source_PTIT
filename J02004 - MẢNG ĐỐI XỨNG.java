package coding;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int n = input.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = input.nextInt();
            }
            int m = 0;
            int k = 1;
            if (n % 2 == 1) {
                m = (int) (n / 2);
            }
            else m=n/2;
            for (int i = 0; i < m; i++) {
                if (A[i] != A[n - 1 - i]) {
                    k = 0;
                }
            }
            if (k == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
    }

}
