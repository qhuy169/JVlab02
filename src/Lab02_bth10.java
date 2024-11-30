import java.util.Scanner;

public class Lab02_bth10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự color (R, G, B): ");
        char color = scanner.next().charAt(0);

        printColor(color);
    }

    public static void printColor(char color) {
        switch (Character.toLowerCase(color)) {
            case 'r':
                System.out.println("RED");
                break;
            case 'g':
                System.out.println("GREEN");
                break;
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
                break;
        }
    }
}
