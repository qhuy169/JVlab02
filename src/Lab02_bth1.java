import java.util.Scanner;

public class Lab02_bth1 {
    private String name;
    private String address;
    private double salary;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Lab02_bth1 bth1 = new Lab02_bth1();
        bth1.input();
        bth1.display();
    }
}
