

import java.util.Scanner;


public class bai3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        int sum = 0;
        System.out.println("\nNatural sum from 1 to " + num);
        for(int i = 1; i <= num; ++i)
        {
            
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

