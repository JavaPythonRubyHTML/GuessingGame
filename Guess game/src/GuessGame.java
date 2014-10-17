import java.util.*;
public class GuessGame 
{
	/*
	 * This program is a guess game
	 * the computer will try to guess 
	 * your age in three tries.
	 * SomeTimes it will sometimes
	 * it wont :D
	 */
 public static void main(String[] args)
 {
	       int personAge = (int) (Math.random() * 67 + 6);           
           Scanner scan = new Scanner(System.in);
           System.out.println("I think I can guess your age in 3 tries: ");
           for(int i = 1; i<=3; i++)
           {
        	   System.out.println("Try number: " + i);
               int guess = scan.nextInt();
               scan.nextLine();
             //scan.nextLine() is important because 
             // without this you would get errors
             // 
               if(guess == personAge)
               {
            	   System.out.println("I know your age your " + " " + personAge + "yrs old.");
               }
               if(guess != personAge)
               {
            	   System.out.println("Is your age higher or lower than " + guess);
            	   String lowHigh = scan.nextLine();
            	if(lowHigh.equalsIgnoreCase("lower"))   
            	{
            		System.out.println("My guess is lower");
            	}
            	else
            	{
            		System.out.println("My guess is higher");
            	}
               }
           }
           
 
           System.out.println("You ran out of tries");
           
          
 }
 }

