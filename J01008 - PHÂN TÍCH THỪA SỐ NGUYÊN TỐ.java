package coding;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int j = 1;
        while (t > 0) {
            int n = input.nextInt();
            System.out.print("Test " + j + ":");
            for (int i = 2; i <= n; i++) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if(count>0)
                {
                    System.out.print(" "+i+"("+count+")");
                }
            }
            System.out.print("\n");
            t--;
            j++;
        }
    }
}