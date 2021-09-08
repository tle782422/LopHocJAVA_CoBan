package bai1;


import java.util.Scanner;
public class bai1{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("nhap lai suat hang thang: ");
double laisuat = input.nextDouble();
System.out.print("nhap lai so nam cho vay: ");
int sonam = input.nextInt();
System.out.print("nhap lai so tien cho vay: ");
double sotienchovay = input.nextDouble();
double nam=1+laisuat;
double laisuathangthang=1-1/Math.pow(nam,sonam*12);
double tong = sotienchovay*laisuat/laisuathangthang;
System.out.println("tong lai suat la " + tong);
}
}
