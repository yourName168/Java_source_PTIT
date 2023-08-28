package coding;

import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            String s = input.next();
            int sum = 0;
            int k = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                if (a - b != 2 && b - a != 2) {
                    k = 0;
                    break;
                } else {
                    sum += a;
                }
            }
            int a = s.charAt(s.length() - 1) - '0';
            sum += a;

            if (k == 1 && sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

    }

}
