//package declaration
package edu.albany.hw2.morse;

//java utilities
import java.util.*;

//class for morse code conversion
public class MorseCodeConverter {
	
	/*To implement the morse code converter,
	 * the strategy that I used to  store the morse code encoding table was to create
	 * two string arrays one to hold the contents of the english alphabet, and another to hold the contents
	 * of the morse code alphabet, I chose this strategy because it is easier and more efficient to compare
	 * the elements in an array with elements of another array by comparing the indexes of specific elements.
	 another benefit of arrays, is that they have a access time of 0(1) which is better than other data structures.
	 */
	
   //string array that holds the contents of the standard alphabet
	public static String[] standardAlphabet = { " ", ",", ".", "?", "0", "1", "2",
	           "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
	           "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
	           "T", "U", "V", "W", "X", "Y", "Z" };
	
	//string array that holds the specified conversion of the contents of the regular alphabet to its morse code equivalent
	public static String[] alphabetMorseCode = { " ", "--..--", ".-.-.-",
	           "..--..", "-----", ".----", "..----", "...--", "....-", ".....",
	           "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..",
	           ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
	           "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
	           ".--", "-..-", "-.--", "--.." };



	
	
	/*method that converts the user inputed string to morse code, takes a parameter of String named userInput, only allows the conversion of the any
	of the specified symbols on from the standard alphabet array, or any uppercase letter, lowercase letters will result in an empty output.*/
    public static String convertToMorseCode(String userInput) {
    	  //object created to allow use of append method
    	  StringBuilder convert= new StringBuilder();
    	  
    	  /*loops to check if the string being converted is less than the user length of the user input, then loops
    	  to check the if any letters exceed the length of the regular English alphabet, then if the index of the regular alphabet matches the 
    	 user input character, append to the alphabet of the morse code, using the append method.*/
    	  
    	  /*
    	   append method appends a the specified string to the sequence of characters, 
    	   */
    	  for(int j=0; j< userInput.length();j++) 
    		  for(int k=0; k<standardAlphabet.length; k++) {
    			  if(standardAlphabet[k].equals(userInput.charAt(j)+"")){
    				 convert.append(alphabetMorseCode[k]+"");
    				  break;
    				  
    			  
    		  }
    	  }
    
    	  //toString method is the string representation of an object
	 return convert.toString();
}

    //main method
public static void main(String[] args) {
	//scanner object
	 Scanner scan= new Scanner(System.in);
	 
	 //ask user to enter a string to convert
	 System.out.println("Please enter a string to convert:");
	 //gets the user input
	 String userInput= scan.nextLine();
	 System.out.println("The morse code conversion is: ");
	 //calls the method that converts the user input to morse code, and prints out the final result.
	 System.out.println(convertToMorseCode(userInput));
    
	 // for loop, that returns all of the values that are passed from the command line.
	 for(int i=0;i<args.length;i++)  
		 System.out.println(args[i]);  
     }
     
     }
