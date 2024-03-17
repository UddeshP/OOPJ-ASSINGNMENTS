import java.util.Scanner;
public class Ass3 {
    public static void main(String []args)
    {
        System.out.println("Press 1 to perform addition");
        System.out.println("Press 2 to perform subtraction");
        System.out.println("Press 3 to perform multiply");
        System.out.println("Press 4 to perform division");

        Scanner se=new Scanner(System.in);
        int choice=se.nextInt();
        System.out.println("Enter two numbers to perform the operation");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Scanner sd=new Scanner(System.in);
        int num2=sd.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Addition is  "+(num1+num2));
            break;
            case 2:
            System.out.println("Subtraction is  "+(num1-num2));
            break;
            case 3:
            System.out.println("Multiplication is  "+(num1*num2));
            break;
            case 4:
            if(num2==0)
            {
                System.out.println("Wrong i/p");
            }
            else
            {
            System.out.println("Division is  "+(num1/num2));
            }
            break;
            default:
            System.out.println("Enter valid number");

            
        }


        


    }
}
