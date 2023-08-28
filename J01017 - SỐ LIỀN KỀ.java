package coding;

import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            String s = input.next();
            int count = 0;
            int k = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                if (a - b != 1 && b - a != 1) {
                    k = 0;
                    break;
                }
            }
            if (k == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

    }

}
