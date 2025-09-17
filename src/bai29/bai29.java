package bai29;

import java.util.Scanner;

public class bai29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap M (so dong): ");
        int M = sc.nextInt();
        System.out.print("Nhap N (so cot): ");
        int N = sc.nextInt();
        sc.close();
        System.out.println("a. Tam giac vuong dac:");
        triangleFull(M);
        System.out.println();

        System.out.println("b. Tam giac vuong rong:");
        triangleFullReverse(M);
        System.out.println();

        System.out.println("c. Tam giac can dac:");
        isoscelesFull(M);
        System.out.println();

        System.out.println("d. Tam giac can rong:");
        isoscelesHollow(M);
        System.out.println();
        
        System.out.println("e. Hinh chu nhat MxN:");
        rectangle(M, N);
    }

    public static void triangleFull(int M) {
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleFullReverse(int M) {
        for (int i = M; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isoscelesFull(int M) {
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void isoscelesHollow(int M) {
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == M) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void rectangle(int M, int N) {
    	for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//	        Scanner sc = new Scanner(System.in);
//	        int M = sc.nextInt();
//	        int N = sc.nextInt();
//	        sc.close();
//	        for (int i = 0; i < M; i++) {
//	            for (int j = 0; j < N; j++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//	    }
}
