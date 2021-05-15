//predicate = pre:before dicate:make known
interface MyDisplayerInterfaceWOMR {
	void display(int number);
}

public class JavaCallBackMethodWOMethodReference {
	
	public static void myCalculator( int number, MyDisplayerInterfaceWOMR myCallback){
	   myCallback.display(number);
	}
	
	public static void main (String args[]) {
		MyDisplayerInterfaceWOMR myDisplayer = (number) -> {
			System.out.println("Displaying number: " + number);
		};
		myCalculator( 100, myDisplayer); 
	}
}