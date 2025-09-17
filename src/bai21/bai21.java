package bai21;

import java.util.Scanner;

public class bai21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi kí tự: ");
        String S = sc.nextLine();
        sc.close();
        String[] words = S.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
