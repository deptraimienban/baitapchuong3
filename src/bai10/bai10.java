package bai10;

public class bai10 {
	public static void main(String[] args) {
        int sum = 0;
        for (int i = 1, count = 0; count < 10; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Tổng 10 số chẵn đầu tiên = " + sum);
    }
}
