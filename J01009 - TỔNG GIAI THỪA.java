package coding;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=giaiThua(i);
        }
        System.out.println(sum);
    }

    public static long giaiThua(int n) {
        long time = 1;
        for (int i = 1; i <= n; i++) {
            time *= i;
        }
        return time;
    }
}
