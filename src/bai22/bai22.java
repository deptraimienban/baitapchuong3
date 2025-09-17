package bai22;

import java.util.Scanner;

public class bai22 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Nguyên tố" : "Không nguyên tố");
    }
}
