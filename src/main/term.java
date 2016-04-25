package main;



/**
 * My term class creates terms to be added onto a polynomial, and also has
 * getter functions to help place the term in the right order of the polynomial. 
 * @author Alston Clark
 * @02731903
 *
 */
public class term{

	
	private int coe;
	private int exp;



//Assuming correct input, as stated in class
	/**
	 * constructor to intialize my coeffcient terms and exponents terms  
	 * @param new_exp
	 * @param new_coe
	 */
public term(int new_exp, int new_coe){
	
	coe = new_coe;
	exp = new_exp;
	
}
	
	
/**
 * This function returns one complete term object.
 * @param coe
 * @param exp
 * @return
 */
public String toString(int coe, int exp){
		
	
	String new_term = "";
	
	new_term += (Integer.toString(coe));
	
	if(exp == 1){
		new_term += "x";
		
		
	}else if(exp > 1){
		new_term += "x^";
		new_term += (Integer.toString(exp));
		
	}
	
	return new_term;

}

/**
 * returns the exponent value
 * @return
 */
public int getExponent(){
	
	return exp;
}

/**
 * returns the coefficient value
 *  
 * @return
 */
public int getcoefficient(){
	
	return coe;
}


}