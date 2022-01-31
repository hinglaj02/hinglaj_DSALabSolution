package greatlearning;
import greatlearning.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String bracketExpression = "([[{}]])";
	Boolean result;
	
	BalancingBrackets ob = new BalancingBrackets(); 
	result = ob.checkingBracketsBalanced(bracketExpression);
	
	if(result)
	
	System.out.println("The entered String has Balanced Brackets");
	else
		System.out.println("The entered Strings do not contain Balanced Brackets");
	}

	


	

	

}
