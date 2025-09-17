package bai23;

import java.util.Scanner;

public class bai23 {
	public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = sc.nextInt();
        System.out.println("Nhập b = ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("USCLN = " + gcd(a, b));
    }
}
