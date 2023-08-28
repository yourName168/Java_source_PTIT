package coding;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a != 0) {
            double result = Math.round((-b / a) * 100) / 100.0;
            String Res=String.format("%.2f",result);
            System.out.println(Res);
        } else if(b!=0){
            System.out.println("VN");
        }
        else{
            System.out.println("VSN");
        }
        input.close();
    }
}
