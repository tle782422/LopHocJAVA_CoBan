import java.util.Scanner;
public class NewClass3 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("nhập số từ (1-7): ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "thứ hai"; break;
            case 2: dayName = "thứ ba"; break;
            case 3: dayName = "thứ tư"; break;
            case 4: dayName = "thứ năm"; break;
            case 5: dayName = "thứ sáu"; break;
            case 6: dayName = "thứ bảy"; break;
            case 7: dayName = "chủ nhật"; break;
            default:dayName = "không tìm thấy trong yêu cầu.";
        }

        return dayName;
    }
}
