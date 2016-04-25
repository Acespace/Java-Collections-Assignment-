package test;
import java.io.*;
import java.util.*;

import main.polynomial;
import main.term;




/**
 * This is my driver method.
 * It calls and tests all of my methods in the polynomial and term classes.
 * It reads from an input file, and then places the polynomial notation in the respective terms 
 * and objects.
 * @author Alston
 *
 */
public class driver {

	
	/**
	 * The driver function reads from the input_file, creates terms, and builds polynomials.
	 * All of the methods of the polynomial class are then tested.
	 * 
	 */
	private static Scanner scan;
	public static void main(String[] args) throws IOException {
	

		String[] lines;
		
		polynomial new_poly = new polynomial();
		File input =  new File("/Users/Alston/Documents/CODES/Large-Scale-Programming-/LargeScale/polynomial/src/resources/input_file.txt");
		
		scan = new Scanner(input);
		
		
		while(scan.hasNextLine()){
			
			String new_line = scan.nextLine();
		
			lines = new_line.split(";");
			System.out.println("length: " + lines.length);
			for(int i = 1; i < lines.length; i++){
				term myTerm = new term(Integer.valueOf(lines[i]), Integer.valueOf(lines[i+1]));
				
				new_poly.insert(myTerm);
				i++;
			}
			
			
			new_poly.delete(5, 3);
			System.out.println("Just Deleted term 5x^3");
			
			new_poly.delete(70, -3);//A term that is not in the polynomial list
			System.out.println("Just Deleted term 5x^3");
			
				
			System.out.println("Reversing the Polynomial");
			new_poly.reverse();
			
			
			
			String product = new_poly.Product();
			System.out.println("P(x):"+ product);
			

		
			
		
	}	
}
}
