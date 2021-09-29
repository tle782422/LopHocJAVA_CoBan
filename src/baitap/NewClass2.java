import java.util.Scanner;
public class NewClass2 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("nhập số: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("số dương nhỏ");
            }
            else if (input > 1000000)
            {
                System.out.println("số dương lớn");
            }
            else
            {
                System.out.println("số dương");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("số âm nhỏ");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("số âm lớn");
            }
            else
            {
                System.out.println("số âm");
            }
        }
        else
        {
            System.out.println("số không");
        }
    }
}