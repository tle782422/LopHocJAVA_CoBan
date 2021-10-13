import java.util.Scanner;  
 
public class baiham3
{  
public static void test()   
{  
Scanner sc= new Scanner(System.in);  
String str= sc.nextLine();              
System.out.print("You have entered: "+str);             
}  
public static void repeat(int n){
    for(int i=0;i<n;i++){
        test();
    }

}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        repeat(num);
                
    }
}

