import java.util.Scanner;


public class Decisionmaking
{
	public static void main(String[] args)
	{
    int input;
    System.out.println("Enter your age:");
    Scanner s = new Scanner(System.in);
    input = s.nextInt();
    if(input>18)
       System.out.println("you are eligible to vote");
    else if(input>20)
        System.out.println("you are major");
     else
         System.out.println("you are not a majot");
         }
   }
