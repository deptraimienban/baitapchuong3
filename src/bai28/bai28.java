package bai28;

public class bai28 {
	public static void main(String[] args) {
        int n = 7;

        System.out.println("Hình 1: tam giác vuông rỗng:");
        printHollowRightTriangle(n);
        System.out.println();

        System.out.println("Hình 2: hình vuông rỗng + 2 đường chéo:");
        printHollowSquareWithTwoDiagonals(n);
        System.out.println();

        System.out.println("Hình 3: chữ X + đường ngang giữa:");
        printXWithMiddleLine(n);
    }

    public static void printHollowRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHollowSquareWithTwoDiagonals(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printXWithMiddleLine(int n) {
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1 || i == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
