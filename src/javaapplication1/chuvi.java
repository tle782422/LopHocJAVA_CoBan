import java.util.Scanner;
class DienTichChuViHT {
 
    public static double tinhChuVi(double r){
        return r * 2 * 3.14;
    }
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        r = scanner.nextDouble();
        System.out.println("Chu vi hình tròn là: "+ tinhChuVi(r));
        System.out.println("----------------------------");
        System.out.println("Chương trình nay được đăng tại Freetuts.net");
    }
}
