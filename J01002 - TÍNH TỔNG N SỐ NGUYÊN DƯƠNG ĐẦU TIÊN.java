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
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            long n=input.nextLong();
            long sum=(n+1)*n/2;
            System.out.println(sum+"\n");
            t--;
        }
    }
    
}