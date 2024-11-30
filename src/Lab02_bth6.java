import java.util.Scanner;

public class Lab02_bth6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        checkTriangle(a, b, c);
    }

    public static void checkTriangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("a, b, c tạo thành một tam giác");
            double perimeter = a + b + c;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Chu vi: " + perimeter);
            System.out.println("Diện tích: " + area);
        } else {
            System.out.println("a, b, c không tạo thành một tam giác");
        }
    }
}
