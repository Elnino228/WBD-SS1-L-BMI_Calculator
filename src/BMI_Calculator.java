import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight=scanner.nextDouble();
        System.out.println("Enter your height: ");
        double height=scanner.nextDouble();
        double bmi=weight/Math.pow(height,2);
        if (bmi<18)
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        else if (bmi<25)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if (bmi<30)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
}
