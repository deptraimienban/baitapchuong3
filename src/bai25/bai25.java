package bai25;

import java.util.Scanner;

public class bai25 {
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
        int sum = 0;
        for (int i = 2; i < N; i++) if (isPrime(i)) sum += i;
        System.out.println("Tổng = " + sum);
    }
}
