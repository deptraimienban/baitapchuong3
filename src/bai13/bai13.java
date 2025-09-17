package bai13;

//import java.util.Scanner;

public class bai13 {
	public static void main(String[] args) {
//		int s = 0;
//		 Scanner scanner = new Scanner(System.in);
//	        System.out.print("Nhập một số nguyên: ");
//	        if (scanner.hasNextInt()) {
//	        	int n = scanner.nextInt();
//	        	s = n;
//	            System.out.println("Số bạn nhập là: " + s);
//	        } else {
//	            System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
//	        }
//	        
//	        scanner.close();
	    int s = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= s; i++)
        	sum += i;
        System.out.println("Tổng = " + sum);
    }
}