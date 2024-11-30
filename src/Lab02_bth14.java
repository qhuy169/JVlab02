import java.util.Scanner;

public class Lab02_bth14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số điện cũ: ");
        int oldIndex = scanner.nextInt();
        System.out.print("Nhập chỉ số điện mới: ");
        int newIndex = scanner.nextInt();

        if (newIndex < oldIndex) {
            System.out.println("Chỉ số mới không được nhỏ hơn chỉ số cũ");
            return;
        }

        calculateElectricityBill(oldIndex, newIndex);
    }

    public static void calculateElectricityBill(int oldIndex, int newIndex) {
        int usedKW = newIndex - oldIndex;
        int basicCost = 50 * 230; // Định mức
        int excessCost = 0;

        if (usedKW > 50) {
            int excessKW = usedKW - 50;
            if (excessKW <= 50) {
                excessCost = excessKW * 480;
            } else if (excessKW <= 100) {
                excessCost = 50 * 480 + (excessKW - 50) * 700;
            } else {
                excessCost = 50 * 480 + 50 * 700 + (excessKW - 100) * 900;
            }
        }

        int totalCost = 10000 + basicCost + excessCost; // Tổng tiền phải trả
        System.out.println("Chỉ số cũ: " + oldIndex);
        System.out.println("Chỉ số mới: " + newIndex);
        System.out.println("Tiền trả định mức: " + basicCost);
        System.out.println("Tiền trả vượt định mức: " + excessCost);
        System.out.println("Tổng tiền phải trả: " + totalCost);
    }
}
