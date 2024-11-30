import java.util.Scanner;

public class Lab02_bth13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        double hours = scanner.nextDouble();
        System.out.print("Nhập lương giờ: ");
        double rate = scanner.nextDouble();

        double totalPay = calculateTotalPay(hours, rate);
        System.out.println("Tổng tiền lương: " + totalPay);
    }

    public static double calculateTotalPay(double hours, double rate) {
        if (hours <= 40) {
            return hours * rate;
        } else {
            return 40 * rate + (hours - 40) * rate * 1.5;
        }
    }
}
