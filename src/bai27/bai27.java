package bai27;

import java.util.Scanner;

public class bai27 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N = ");
        int n = sc.nextInt();
        sc.close();
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
