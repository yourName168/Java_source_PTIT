package coding;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n > 0) {
            long a = input.nextLong();
            int k = 1;
            for (int i = 2; i < sqrt(a); i++) {
                if (a % i == 0) {
                    k = 0;
                    break;
                }
            }
            if (k == 0) {
                System.out.println("NO\n");
            } else {
                System.out.println("YES\n");
            }
            n--;
        }
        input.close();
    }
}
