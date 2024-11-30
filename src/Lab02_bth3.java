import java.util.Scanner;

public class Lab02_bth3 {
    private String ten;
    private String msv;
    private float diemLyThuyetJava;
    private float diemThucHanhJava;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap msv: ");
        msv = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        diemLyThuyetJava = sc.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        diemThucHanhJava = sc.nextFloat();
    }
void xepLoai(){
        float dtb;
        dtb = (diemLyThuyetJava + diemThucHanhJava)/2;
        if (diemLyThuyetJava < 4){
            System.out.println("Thi lai ly thuyet");
        } 
        if (diemThucHanhJava > 4) {
            System.out.println("Thi lai thuc hanh");
        }
        if (dtb > 7) {
            System.out.println("Sinh vien xuat sac mon Java");
        } else if (dtb > 4 & dtb < 7) {
            System.out.println("Sinh vien dat mon Java");
        } else {
            System.out.println("Sinh vien phai hoc lai");
        }
}
    public static void main(String[] args) {

    }
}
