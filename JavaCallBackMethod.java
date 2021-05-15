//predicate = pre:before dicate:make known
interface MyDiisplayerInterface {
	String stringFunction(String str);
}


public class JavaCallBackMethod {

	public static String myDisplayer(int number) {
		System.out.println("Displaying number: " + number)
	}
	
	public static void myCalculator(MyDiisplayerInterface myCallback, String str){
	   myCallback.stringFunction(str);
	}
	
	public static void main (String args[]) {
		// lambda to reverse string
		MyDiisplayerInterface reverse = (str) -> {		
			return new StringBuffer(str).reverse().toString();
		};

		// Output: omeD adbmaL
		myCalculator(reverse, "Lambda Demo"); 
	}
}
