import java.util.Scanner;


public class bai4 {
    



  public static void main(String[] args) {

    int count = 0; 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any number : ");
    int num = scanner.nextInt();

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}
    
