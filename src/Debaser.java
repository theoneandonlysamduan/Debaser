/**
 * This program converts a number to/from base ten. 
 * 
 * Sam:
 * I finished this program weeks ago before it's due, and then I focused on teaching
 * Leya how to make her own code. She looked online for algorithmns, and I helped her
 * converting natural language into Java. Leya currently has a working program also. 
 * 
 * In the process of explaining how the program works, I was able to optimize this 
 * piece of code also. So I would say it is a learning experience both for her and 
 * for me. 
 * 
 * Leya:
 * I learned the algorithm of converting base to base and came up with two ideas of
 * using string and integer division, but after Sam explained his code to me, we decided
 * to use his code since it is more efficient and simple. With Sam's help, I caught up 
 * with everything really quickly, and overall, it was a great collaboration.  
 * 
 * @author sam, leya
 *
 */
public class Debaser {
	//Instance Fields:
	private int val; 	//val is either set in constructors or by setValue. 
	
	//Methods:
	
	//Constructors: 
	
	/**
	 * Default constructor. 
	 * Defaults stored value to 0. 
	 */
	public Debaser() {
		val = 0; 
	}
	
	/**
	 * Sets stored value to inputed value. 
	 * @param val the inputed value. 
	 */
	public Debaser(int val) {
		this.val = val; 
	}
	
	//Mutators: 
	
	/**
	 * Sets stored value to inputed value. 
	 * @param val the inputed value. 
	 */
	public void setValue(int val) {
		this.val = val; 
	}
	
	//Accessors: 
	
	/**
	 * Returns stored value. 
	 * @return stored value. 
	 */
	public int  getValue() {
		return val; 
	}
	
	
	/**
	 * Converts the stored number to the given base from base 10. 
	 * Does not change the stored value. 
	 * @param base desired base to change into. 
	 * @return resultant number after the conversion stored in int type. 
	 */
	public int convertToBaseN(int base) {
		int tempVal = val; 	//tempVal stores the value of val, and it is going to be changed. 
		int rstVal  = 0; 	//rstVal stores the result of the operation. 
		int degree  = 0; 	//Degree stores which degree the "current digit" is at. 
		
		//tempVal % base, store the result to the corresponding digit. 
		//tempVal = tempVal / base
		
		rstVal += (tempVal % base) * Math.pow(10, degree);
		tempVal /= base; 
		degree += 1; 
		
		//Repeat this operation 5 more times so it would generate 6 digits. 
		//Overflow would be mathmetically prevented because temp would become zero. 
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
		int tempVal = val; 	//A replica of val is used because the number is changed in the conversion process. 
		int rstVal  = 0; 	//Result from the conversion. 
		int degree  = 0; 	//The degree of "current digit" the program is at in the parsing process. 
		int currentDigit = 0; 	//Stores the "current digit."
		
		//rstVal += digit at a position * base ^ degree
		currentDigit = tempVal % 10; 	//Gets the last digit of the current number. 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	//Removes the last number from the original number.
		degree ++;
		
		//Repeat the operation 5 more times so that all six potential digits are dealt with. 
		//If there are no six digits only 0 will be added to rstVal. 
		currentDigit = tempVal % 10; 	
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 	
		degree ++; 
		
		currentDigit = tempVal % 10; 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 
		degree ++; 
		
		currentDigit = tempVal % 10; 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 
		degree ++; 
		
		currentDigit = tempVal % 10; 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 
		degree ++; 
		
		currentDigit = tempVal % 10; 
		rstVal += currentDigit * Math.pow(base, degree);  
		tempVal /= 10; 
		degree ++; 
		
		//Return result. 
		return rstVal; 
	}
}
