import java.util.Scanner;
public class lam1 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int x = 0; 
        String ten = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                ten = "January";
                x = 31;
                break;
            case 2:
                ten = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    x = 29;
                } else {
                    x = 28;
                }
                break;
            case 3:
                ten = "March";
                x = 31;
                break;
            case 4:
                ten = "April";
                x = 30;
                break;
            case 5:
                ten = "May";
                x = 31;
                break;
            case 6:
                ten= "June";
                x = 30;
                break;
            case 7:
                ten = "July";
                x = 31;
                break;
            case 8:
                ten = "August";
                x = 31;
                break;
            case 9:
                ten = "September";
                x = 30;
                break;
            case 10:
                ten = "October";
                x = 31;
                break;
            case 11:
                ten = "November";
                x = 30;
                break;
            case 12:
                ten = "December";
                x = 31;
        }
        System.out.print(ten + " " + year + " has " + x + " days\n");
    }
}
