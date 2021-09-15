import java.util.Scanner;
public class java1592021bai2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("nhap trong luong theo don vi pound: "); 
    double weight = input.nextDouble();
    System.out.print("nhap chieu cao theo don vi inches: ");
    double height = input.nextDouble(); 
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms /(heightInMeters * heightInMeters);
    System.out.printf("chi so BMI cua ban la: %5.2f\n", bmi);
    if (bmi < 16)
    System.out.println("ban thieu can tram trong.");
    else if (bmi < 18)
    System.out.println("ban thieu can.");
    else if (bmi < 24)
    System.out.println("ban nam o muc can nang binh thuong.");
    else if (bmi < 29)
    System.out.println("ban hoi nang ki roi day.");
    else if (bmi < 35)
    System.out.println("ban thu can nghiem trong, can giam can ngay.");
    else
    System.out.println("ban qua can roi, can den ngay bac si de kham.");
    }
    
}

