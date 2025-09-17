package bai20;

import java.util.Scanner;

public class bai20 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        sc.close();
	        int count = 0;
	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) count++;
	        }
	        System.out.println("Số lượng ký tự số = " + count);
	    }
}
