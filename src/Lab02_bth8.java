import java.util.Scanner;

public class Lab02_bth8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        printDaysInMonth(thang, nam);
    }

    public static void printDaysInMonth(int thang, int nam) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tháng này có 30 ngày");
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    System.out.println("Tháng này có 29 ngày (năm nhuận)");
                } else {
                    System.out.println("Tháng này có 28 ngày");
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ");
                break;
        }
    }
}
