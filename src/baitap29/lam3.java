import java.util.Scanner;
public class lam3 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        
        String rs;
        rs = (x && (y || z))? year + " is a leap year" : year + " is not a leap year";
        System.out.print(rs);
        
    }
}
