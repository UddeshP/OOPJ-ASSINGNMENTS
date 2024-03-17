import java.util.Scanner;
class Ass2
{
    public static void main(String [] args)
    {
        System.out.println("Enter a year to check that it is leap or not");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Century leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else if(year%4==0)
        {
           System.out.println("Leap year");
        }
        else
        {
            System.out.println("NOT Leap year");
        }


    }
}