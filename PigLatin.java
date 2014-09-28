import java.util.Scanner; // for keyboard input

public class PigLatin {
	public static void main(String[] args){
		
		// Variable declaration
		// ---------------------------------
		String first; // for first name, input by user
		String last; // for last name, input by user
		String first_piglatin; // first name in pig latin
		String last_piglatin; // last name in pig latin
		String first_piglatin_capital;
		String last_piglatin_capital;
		Scanner keyboard = new Scanner(System.in);
		
		// Welcome message
		// ---------------------------------
		System.out.println("*************************************************");
		System.out.println("**                                             **");
		System.out.println("**         PIG LATIN NAME GENERATOR            **");
		System.out.println("**                                             **");
		System.out.println("*************************************************");
		System.out.println();
		
		// Ask for user input
		// ---------------------------------
		System.out.print("Enter your first name and last name: ");
		first = keyboard.next();
		last = keyboard.next();
		keyboard.close();
				
		// Conversion to Pig Latin
		//---------------------------------------
		first_piglatin = first; 
		last_piglatin = last;
		first_piglatin = first_piglatin.substring(1)+first_piglatin.substring(0,1); 
		first_piglatin = first_piglatin.concat("ay"); 
		last_piglatin = last_piglatin.substring(1)+last_piglatin.substring(0,1); 
		last_piglatin = last_piglatin.concat("ay"); 
		
		// Let's get the words properly capitalized
		first_piglatin = first_piglatin.toLowerCase();
		last_piglatin = last_piglatin.toLowerCase();
		first_piglatin_capital = first_piglatin.substring(0,1);  
		first_piglatin_capital = first_piglatin_capital.toUpperCase(); 
		first_piglatin = first_piglatin_capital + first_piglatin.substring(1); 
		last_piglatin_capital = last_piglatin.substring(0,1);
		last_piglatin_capital = last_piglatin_capital.toUpperCase();
		last_piglatin = last_piglatin_capital + last_piglatin.substring(1);
		
		// Result output
		//---------------------------------------
		System.out.println();
		System.out.print(first + " " + last + " in Pig Latin is \'" + first_piglatin + " " + last_piglatin + "\'");
		
		// Exit message
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Thank you for using the Pig Latin Name Generator! Goodbye!");
	}

}
