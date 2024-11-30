import java.util.Scanner;

public class Lab02_bth12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();

        evaluateStudent(toan, ly, hoa);
    }

    public static void evaluateStudent(double toan, double ly, double hoa) {
        double total = toan + ly + hoa;
        if (total >= 15 && toan >= 4 && ly >= 4 && hoa >= 4) {
            System.out.println("Đậu");
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Học đều các môn");
            } else {
                System.out.println("Học chưa đều các môn");
            }
        } else {
            System.out.println("Thi hỏng");
        }
    }
}
