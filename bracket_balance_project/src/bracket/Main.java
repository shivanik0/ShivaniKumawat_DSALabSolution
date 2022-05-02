package bracket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string=new String();
		string="([[{}]]))";

		boolean result;

		CheckBalancingBrackets checkBrackets=new CheckBalancingBrackets();
		result=checkBrackets.stackImplementation(string);		

		if (result==true)
			System.out.println("\nThe entered String has Balanced Brackets");
		else
			System.out.println("\nThe entered String does not contain Balanced Brackets");
	}

}
