import java.util.Scanner;
public class Ass6 {
    public static void main(String []args)
    {
        // to print body mass index
        System.out.println("Enter your height in mcm and weight in kg");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        Scanner sd=new Scanner(System.in);
        double weight=sd.nextDouble();
     
        double BMI= weight/((height)*(height)/10000);

        if(BMI<18.5)
        {
           System.out.println("Underweight");
        }
        else if(BMI>18.5 && BMI<24.9)
        {
            System.out.println("Normal weight");
        }
        else 
        {
            System.out.println("Overweight");
        }

    }
}
