
 
import java.util.Scanner;
 
public class huyhoang2021 {
 
    public static void main(String[] args) {
        String username = "huyhoang";
        int password = 2021;
        String guessUser; 
        int guessPass;
        int check=0;
        Scanner scanner = new Scanner(System.in);
        
      
            System.out.println("Nhập vào username: ");
            guessUser = scanner.nextLine();
            System.out.println("Nhập vào password: ");
            guessPass = scanner.nextInt();
        if((username == guessUser) || (password == guessPass)){
            check=1;
        }
        if(check==1){
            System.out.println("nhập đúng. ");
        }
        else System.out.println("nhập sai rồi. ");
    }
}