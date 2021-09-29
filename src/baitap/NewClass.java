
import java.util.Scanner;
public class NewClass {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("nhập số: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("đây là số dương");
        }
        else if (input < 0)
        {
            System.out.println("đây là số âm");
        }
        else
        {
            System.out.println("đây là số 0");
        }
    }
}