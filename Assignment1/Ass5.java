import java.util.Scanner;
public class Ass5 {
    // i/p ---> a e i o u ----vowels

    public static void main(String []args)
    {
            System.out.println("Enter a char to check vowel or consonant");
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonant");
            }
    }
    
}
