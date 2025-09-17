package bai24;

import java.util.Scanner;

public class bai24 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập N = ");
	        int N = sc.nextInt();
	        sc.close();
	        int sum = 0;
	        for (int i = 0; i < N; i++) {
	            sum += sc.nextInt();
	        }
	        System.out.println("Tổng = " + sum);
	    }
}
