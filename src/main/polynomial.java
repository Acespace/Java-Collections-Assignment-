package main;
import java.util.*;
import main.term;


public class polynomial {

	
	private ArrayList<term> polynomial_list;
	
	
	public polynomial(){
		
		polynomial_list = new ArrayList<term>();

	}
	
	/**
	 * This method inserts the new term into the array list, in order
	 * 
	 * @param coe
	 * @param exp
	 */
	public void insert(term newTerm){
		
		int exp = newTerm.getExponent();
		
		polynomial_list.add(newTerm);
		
		if(polynomial_list.size() > 1){   //If the size of the ArrayList is greater than 1, then I will need to insert the new term in order
			
			for(int i = 0; i < polynomial_list.size(); i++){
				
				if (polynomial_list.get(i).getExponent() > exp){
					
					polynomial_list.add(newTerm);
					}
			}
		}
		}
	
	/**
	 * The product method returns a the whole polynomial as a string.
	 * @return
	 */
	public String Product(){
		String poly ="";
		
		for(int i = 0; i < polynomial_list.size(); i++){
			
			if(i != 0){
				poly += "+" + polynomial_list.get(i).toString();
			}
		}
		
		return poly;
		
	}
	
	/**
	 * This method deletes terms from the polynomial by locating the given
	 * expoenent and coefficient.
	 * 
	 * If the term is not found, then an error message is returned
	 * @param coe
	 * @param exp
	 */
	public void delete(int coe, int exp){
		
		for(int i = 0; i < polynomial_list.size(); i++){
			
			if ((polynomial_list.get(i).getExponent() == exp) &&  (polynomial_list.get(i).getcoefficient() == coe)){
				
					polynomial_list.remove(i);
					return;
				
				}
			System.out.println("Your term was not found.");
			
	}
	
	}
	/**
	 * This functions returns the reverse order of the polynomial, by using a loop to
	 * iterate through the ArrayList.
	 * 
	 * @return
	 */
	public String reverse(){
		String reverse_poly ="";
			
			for(int i = polynomial_list.size(); i >=0 ; i--){

				if(i != 0){
					reverse_poly += "+" + polynomial_list.get(i).toString();
				}
		
			}
			
			
			return reverse_poly;
			
		
	}
	
	
}
