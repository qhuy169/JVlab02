import java.util.Scanner;

public class Lab02_bth4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Giải phương trình bậc 2 --------");

        // Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a (a ≠ 0): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Gọi hàm giải phương trình bậc 2
        giaiPhuongTrinhBac2(a, b, c);

        scanner.close();
    }

    // Hàm giải phương trình bậc 2
    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        // Kiểm tra nếu a = 0, không phải phương trình bậc 2
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc 2 vì a = 0.");
        } else {
            // Tính discriminant (delta)
            double delta = b * b - 4 * a * c;

            // Kiểm tra các trường hợp theo giá trị của delta
            if (delta > 0) {
                // Hai nghiệm thực phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("Nghiệm 1: x1 = " + x1);
                System.out.println("Nghiệm 2: x2 = " + x2);
            } else if (delta == 0) {
                // Một nghiệm kép
                double x = -b / (2 * a);
                System.out.println("Phương trình có một nghiệm kép:");
                System.out.println("Nghiệm: x = " + x);
            } else {
                // Không có nghiệm thực
                System.out.println("Phương trình vô nghiệm (delta < 0).");
            }
        }
    }
}

