/**
 * Tester for the Debaser class. 
 * @author sam
 *
 */
public class DebaserTester {

	public static void main(String[] args) {
		Debaser debaser = new Debaser(20);
		System.out.println(debaser.getValue());
		System.out.println("Expected: 20");
		debaser.setValue(10);
		System.out.println(debaser.getValue());
		System.out.println("Expected: 10");
		int convertedNum = debaser.converToBaseN(2);
		System.out.println(convertedNum);
		System.out.println("Expected: 1010");
		debaser.setValue(convertedNum);
		convertedNum = debaser.convertToBaseTen(2);
		System.out.println(convertedNum);
		System.out.println("Expected: 10");
	}

}
