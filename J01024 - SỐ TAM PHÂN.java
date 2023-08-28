package coding;

import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            String s = input.next();
            int k = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0') {
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
