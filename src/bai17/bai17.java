package bai17;

import java.util.Scanner;

public class bai17 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        if (n == 0) System.out.println("Zero");
	        else if (n % 2 == 0) System.out.println("Even");
	        else System.out.println("Odd");
	    }
}
