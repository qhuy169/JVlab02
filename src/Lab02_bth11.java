import java.util.Scanner;

public class Lab02_bth11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhập số y: ");
        double y = scanner.nextDouble();
        System.out.print("Nhập toán tử (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        calculate(x, y, operator);
    }

    public static void calculate(double x, double y, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Kết quả: " + (x + y));
                break;
            case '-':
                System.out.println("Kết quả: " + (x - y));
                break;
            case '*':
                System.out.println("Kết quả: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Kết quả: " + (x / y));
                } else {
                    System.out.println("Không thể chia cho 0");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ");
                break;
        }
    }
}
