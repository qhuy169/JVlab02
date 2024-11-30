import java.util.Scanner;

public class Lab02_bth2 {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("So luong banh xe: ");
        soLuongBanhXe = sc.nextInt();
    }
    void hienThiThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("Nha san xuat: " + nhaSanXuat);
        System.out.println("So luong banh xe: " + soLuongBanhXe);
    }
    public static void main(String[] args) {
        Lab02_bth2 b = new Lab02_bth2();
        b.nhapThongTin();
        b.hienThiThongTin();
    }
}
