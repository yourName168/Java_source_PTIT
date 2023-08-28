/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coding;
import java.util.Scanner;
/**
 *
 * @author hieul
 */
public class Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        if (length <= 0 || width <= 0) {
            System.out.println("0");
        } else {
            int perimeter = 2 * (length + width);
            int area = length * width;
            System.out.println( perimeter+" "+area);
        }
    }
    
}
