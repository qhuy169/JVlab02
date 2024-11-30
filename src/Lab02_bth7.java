import java.util.Scanner;

public class Lab02_bth7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Nhập số " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Số lớn nhất là: " + findMax(nums));
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
