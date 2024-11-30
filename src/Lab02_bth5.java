import java.util.Scanner;

public class Lab02_bth5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();
        checkEvenOdd(N);
    }

    public static void checkEvenOdd(int N) {
        if (N % 2 == 0) {
            System.out.println(N + " là số chẵn");
        } else {
            System.out.println(N + " là số lẻ");
        }
    }
}
