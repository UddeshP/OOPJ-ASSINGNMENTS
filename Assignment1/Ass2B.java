import java.util.Scanner;
public class Ass2B {
    public static void main(String [] args)
    {
        System.out.println("Enter the year to check that it is leap or not");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
      
        switch(year%400)
        {
            case 0:
            System.out.println("Century Leap year");
            break;
            default:
            switch(year%4)
            {
                case 0:
                switch(year%100)
                {
                    case 0:
                    System.out.println("Not Leap year");
                    break;
                    default:
                    System.out.println("Leap year");
                    break;
                }
                break;
                default:
                System.out.println("Not a Leap year");
                break;


            }
            



        }
       
    }
}
