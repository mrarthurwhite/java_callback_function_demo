//predicate = pre:before dicate:make known
interface MyDisplayerInterface {
	void display(int number);
}


public class JavaCallBackMethod {

	public static void myDisplayer(int number) {
		System.out.println("Displaying number: " + number);
	}
	
	public static void myCalculator( int number, MyDisplayerInterface myCallback){
	   myCallback.display(number);
	}
	
	public static void main (String args[]) {
		myCalculator( 100, JavaCallBackMethod::myDisplayer); 
	}
}
