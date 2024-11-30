import java.util.Scanner;

public class DuBaoThoiTiet {
    int status;
    void nhapDuLieu(){
        System.out.println("Chuong trinh du bao thoi tiet chuon chuon!");
        System.out.println("1. Bay thap");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vua");
        System.out.println("4. Say ruou cmn r");
        System.out.println("Mời nhập từ 1 đến 4");
        Scanner sc = new Scanner(System.in);
        status = sc.nextInt();
        System.out.println("Cam on da nhap");
    }
    void hienThiDuBao(){
        switch(status){
            case 1:
                System.out.println("Du bao: Mua, khi ra khoi nha nho mang ao mua");
                break;
            case 2:
                System.out.println("Du bao: Nang, nho mang o nhe");
                break;
            case 3:
                System.out.println("Du bao: Ram, mat gioi");
                break;
            case 4:
                System.out.println("Chuon chuon thu *beep* 404 lan nhung ko ra ket qua");
                break;
        }
    }
    public static void main(String[] args) {
        DuBaoThoiTiet dbtt = new DuBaoThoiTiet();
        dbtt.nhapDuLieu();
        dbtt.hienThiDuBao();
    }
}
