/**
 * This program converts a number to/from base ten. 
 * @author sam
 *
 */
public class Debaser {
	//Instance fields. 
	int 	numberInt; 	//Stores the number in int form for mathematical conversion. 
	String 	numberStr; 	//Stores the number in String form for string operations. 
	int  convertedInt; 	//Stores the converted number in Int form. 
	String convertedStr; //Stores the converted number in String form. 
	
	//Constructors. 
	/**
	 * Default constructor. Defaults the vals to zero. 
	 */
	public Debaser() {
		numberInt = 0; 
		numberStr = "0";
		convertedInt = 0; 
		convertedStr = "0";
	}
	
	/**
	 * Sets the numbers to be converted to the input value. 
	 * @param value sets stored values to value. 
	 */
	public Debaser(int value) {
		numberInt = value; 
		numberStr = Integer.toString(value);
	}
	
	/**
	 * Manually sets the numbers to be converted to the input value. 
	 * Does not change convertedInt. 
	 * @param value sets stored values to value. 
	 */
	public void setValue(int value) {
		numberInt = value; 
		numberStr = Integer.toString(value);
	}
	
	/**
	 * Retrieves the value stored in the object(converted or not). 
	 * @return the calue stored in the object. 
	 */
	public int getValue() {
		return convertedInt; 
	}
	
	/**
	 * Converts the stored value into the given base, then returns the value
	 * in int type. 
	 * @param base	The number base desired. 
	 * @return		converted number into the given base. 
	 */
	public int converToBaseN(int base) {
		int tempDigit = 0; 		//Stores every digit separated from the source number. 
		String tempStr = "";	//Temporary variable only used to construct the converted number. 
		int tempConvertedInt = 0; //Temporary variable only used to construct the converted number. 
		//Reset the convertedInt and tempStr. 
		
		//Repeat modulus and whole division 6 times. 
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		
		tempDigit = numberInt % base; 
		tempStr = tempStr + Integer.toString(tempDigit);	//Add the digit to the end of the converted number string. 
		numberInt /= base; 
		//Put the constructed number string into an int, then return
		tempConvertedInt = Integer.parseInt(tempStr);
		return tempConvertedInt; 
	}
	
	public int convertToBaseTen(int fromBase) {
		//Initiate the temporary vars used to save converted number. 
		int tempConvertedInt = 0; 
		int lenNumberStr = numberStr.length(); 
		int degree = lenNumberStr - 1; 	//Stores the degree of the digit currently at when parsing through the string. 
										//	-1 because the degree of the rightmost digit is 0. 
		//Set the highest degree possible, then go through numberStr. Repeat 6 times. 
		//For every digit n, Following formula is used: 
		//tempConvertedInt += n * (fromBase)^degree; 
		//degree --; 
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		tempConvertedInt += Integer.parseInt(Character.toString(numberStr.charAt(0))) * fromBase ^ degree; 
		degree --; 
		numberStr = numberStr.substring(1);
		
		numberStr = Integer.toString(numberInt);
		
		return tempConvertedInt; 
	}
}
