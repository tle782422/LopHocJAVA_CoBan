import java.util.Scanner;

public class bai5 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("the result is: ");
        int num = 10;

        int i = 1;

        while (i <= num) {

            System.out.print(i*(-1) + " ");
            i++;
        }

    }

}
