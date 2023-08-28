package coding;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int n = input.nextInt();
            int a = (int) sqrt(n);
            if (a * a == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

}
