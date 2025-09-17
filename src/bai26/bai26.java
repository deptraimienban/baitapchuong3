package bai26;

import java.util.Scanner;

public class bai26 {
	 public static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++)
	            if (n % i == 0) return false;
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập N = ");
	        int N = sc.nextInt();
	        sc.close();
	        int count = 0, num = 2, sum = 0;
	        while (count < N) {
	            if (isPrime(num)) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }
	        System.out.println("Tổng = " + sum);
	    }
}
