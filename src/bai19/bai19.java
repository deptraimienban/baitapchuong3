package bai19;

import java.util.Scanner;

public class bai19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự: ");
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') count++;
        }
        System.out.println("Số lần xuất hiện của 'a' = " + count);
    }
}
