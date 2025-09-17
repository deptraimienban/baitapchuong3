package bai15;

//import java.util.Scanner;

public class bai15 {
	public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Vui lòng nhập một dãy số.");
//            return;
//        }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (String arg : args) {
//            try {
//                int num = Integer.parseInt(arg);
//
//                if (num > max) {
//                    max = num;
//                }
//                if (num < min) {
//                    min = num;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Lỗi: " + arg + " không phải là một số hợp lệ.");
//                return;
//            }
//        }
//
//        System.out.println("Giá trị lớn nhất là: " + max);
//        System.out.println("Giá trị nhỏ nhất là: " + min);
		
        int min = Integer.parseInt(args[0]);
        int max = min;
        for (String s : args) {
            int val = Integer.parseInt(s);
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Min = " + min + ", Max = " + max);
}
}