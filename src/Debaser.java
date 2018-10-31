/**
 * This program converts a number to/from base ten. 
 * @author sam
 *
 */
public class Debaser {
	private int val = 0; 
	
	/**
	 * Default constructor. 
	 * Defaults stored value to 0. 
	 */
	public Debaser() {
		val = 0; 
	}
	
	/**
	 * Constructor. 
	 * Sets stored value to inputed value. 
	 * @param val the inputed value. 
	 */
	public Debaser(int val) {
		this.val = val; 
	}
	
	/**
	 * Setter. 
	 * Sets stored value to inputed value. 
	 * @param val the inputed value. 
	 */
	public void setValue(int val) {
		this.val = val; 
	}
	
	/**
	 * Returns stored value. 
	 * @return stored value. 
	 */
	public int  getValue() {
		return val; 
	}
	
	//TODO: Both conversions are not working. Need to fix them. 
	
	/**
	 * Converts the stored number to the given base from base 10. 
	 * Does not change the stored value. 
	 * @param base desired base to change into. 
	 * @return resultant number after the conversion stored in int type. 
	 */
	public int converToBaseN(int base) {
		int tempVal = val; 	//tempVal stores the value of val, and it is going to be changed. 
		int rstVal  = 0; 	//rstVal stores the result of the operation. 
		int degree  = 0; 	//Degree stores which degree the "current digit" is at. 
		
		//tempVal % base, store the result to the corresponding digit. 
		//tempVal = tempVal / base
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		//Repeat this operation 5 more times so there are 6 digits. 
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		//Return rstVal, where the result is stored. 
		return rstVal; 
	}
	
	/**
	 * Converts the stored number into base ten according to the given base. 
	 * Does not change the stored value. 
	 * @param base base that the stored value is in. 
	 * @return resultant number after conversion stored in int type. 
	 */
	public int convertToBaseTen(int base) {
		int tempVal = val; 
		int rstVal  = 0; 
		int degree  = 0; 
		int currentDigit = 0; 
		//rstVal += digit at a position * base ^ degree
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++;
		//Repeat the operation 5 more times. 
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++; 
		
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++; 
		
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++; 
		
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++; 
		
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++; 
		
		//Return result. 
		return rstVal; 
	}
}
