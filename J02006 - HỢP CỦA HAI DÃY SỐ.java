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
        int[] A = new int[m];
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < m + n; i++) {
            int t = input.nextInt();
            set.add(t);
        }
        for (int i : set) {
            System.out.printf(i+" ");
        }

    }
}
