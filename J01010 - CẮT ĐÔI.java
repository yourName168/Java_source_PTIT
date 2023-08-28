package coding;

import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine(); // Đọc dư thừa ký tự xuống dòng sau khi đọc số t

        while (t > 0) {
            String s = input.next(); // Đọc chuỗi từ người dùng
            long sum = 0;
            boolean valid = true;
            
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    sum += 1 * (long) Math.pow(10, s.length() - i - 1);
                } else if (c != '0' && c != '8' && c != '9') {
                    valid = false;
                    break;
                }
            }
            
            if (valid && sum != 0) {
                System.out.println(sum);
            } else {
                System.out.println("INVALID");
            }
            t--;
        }
    }
}
