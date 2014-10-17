import java.util.*;
public class GuessGame 
{
 public static void main(String[] args)
 {
	       int personAge = (int) (Math.random() * 67 + 6);           
           Scanner scan = new Scanner(System.in);
           System.out.println("I think I can guess your age in 3 tries: ");
           for(int i = 1; i<=3; i++)
           {
        	   System.out.println("Try number: " + i);
               int guess = scan.nextInt();

               if(guess == personAge)
               {
            	   System.out.println("I know your age your " + " " + personAge + "yrs old.");
               }
               if(guess != personAge)
               {
            	   System.out.println("Is your age higher or lower than " + guess);
               }
           }
           System.out.println("You ran out of tries");
          
 }
 }

