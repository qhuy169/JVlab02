import java.util.Scanner;
import java.util.Random;

public class Lab02_bth9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Búa (B), Kéo (K), hoặc Giấy (G): ");
        String playerInput = scanner.next().toUpperCase();
        String player = getPlayerChoice(playerInput);

        if (player.equals("")) {
            System.out.println("Lựa chọn không hợp lệ");
            return;
        }

        String computer = getComputerChoice();
        System.out.println("Máy chọn: " + computer);

        getResult(player, computer);
    }

    public static String getPlayerChoice(String playerInput) {
        switch (playerInput) {
            case "B":
                return "Búa";
            case "K":
                return "Kéo";
            case "G":
                return "Giấy";
            default:
                return "";
        }
    }

    public static String getComputerChoice() {
        String[] options = {"Búa", "Kéo", "Giấy"};
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }

    public static void getResult(String player, String computer) {
        if (player.equals(computer)) {
            System.out.println("Hòa");
        } else if ((player.equals("Búa") && computer.equals("Kéo")) ||
                (player.equals("Kéo") && computer.equals("Giấy")) ||
                (player.equals("Giấy") && computer.equals("Búa"))) {
            System.out.println("Bạn thắng");
        } else {
            System.out.println("Bạn thua");
        }
    }
}
