import java.util.Scanner;
public class NewClass4 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("nhập vào số có dấu phẩy động: ");
        double x = in.nextDouble();
        System.out.print("nhập vào số có dấu phẩy động thứ hai: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("hai số giống nhau đến ba chữ số thập phân");
        }
        else
        {
            System.out.println("hai số khác nhau");
        }
    }
}
