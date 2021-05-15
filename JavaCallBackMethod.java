//predicate = pre:before dicate:make known
interface MyDiisplayerInterface {
	String stringFunction(String str);
}


public class JavaCallBackMethod {

	public static String myDisplayer(int number) {
		System.out.println("Displaying number: " + number)
	}
	
	public static void myCalculator( int number, MyDiisplayerInterface myCallback){
	   myCallback.stringFunction(number);
	}
	
	public static void main (String args[]) {
		// lambda to reverse string
		MyDiisplayerInterface reverse = (str) -> {		
			return new StringBuffer(str).reverse().toString();
		};

		// 
		myCalculator( 100, reverse); 
	}
}
