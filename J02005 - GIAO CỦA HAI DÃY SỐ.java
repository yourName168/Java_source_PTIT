package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class code {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[] A=new int[m];
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < m; i++) {
            A[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            
            int t=input.nextInt();
            for (int j = 0; j < m; j++) {
                if(t==A[j]){
                    set.add(t);
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.printf("%d ",i);
        }
    }
}