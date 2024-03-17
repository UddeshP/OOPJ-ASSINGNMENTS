import java.util.Scanner;
class Ass1
{
    public static void main(String [] args)
    {
        System.out.println("Enter the numerical grades");
        Scanner sc=new Scanner(System.in);
        int grade=sc.nextInt();
        if(grade>=90 && grade<=100)
        {
            System.out.println("A grade");
        }
        else if(grade>75 && grade<90)
        {
            System.out.println("B grade");
        }
        else if(grade>60)
        {
            System.out.println("C grade");
        }
        else
        {
            System.out.println("You are failed. Please reattempt");
        }


    }
}