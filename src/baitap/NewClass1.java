import java.util.Scanner;
public class NewClass1 {

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("nhập số thứ nhất: ");
  int num1 = in.nextInt();
   
  System.out.print("nhập số thứ hai: ");
  int num2 = in.nextInt();
   
  System.out.print("nhập số thứ 3: ");
  int num3 = in.nextInt();
   
  if (num1 > num2)
   if (num1 > num3)
    System.out.println("số lớn nhất là: " + num1);
   
  if (num2 > num1)
   if (num2 > num3)
    System.out.println("số lớn nhất là: " + num2);
   
  if (num3 > num1)
   if (num3 > num2)
    System.out.println("số lớn nhất là: " + num3);
 }
}
