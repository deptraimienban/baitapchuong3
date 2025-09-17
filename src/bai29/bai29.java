package bai29;

import java.util.Scanner;

public class bai29 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int M = sc.nextInt();
	        int N = sc.nextInt();
	        sc.close();
	        for (int i = 0; i < M; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
}
