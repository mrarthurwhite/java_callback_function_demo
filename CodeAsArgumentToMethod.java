interface StringManipulation {
	String stringFunction(String str);
}

public class CodeAsArgumentToMethod {

	public static String modifyStr(StringManipulation manipulation, String str){
	  return manipulation.stringFunction(str);
	}
	public static void main (String args[]) {
		// Block lambda to reverse string
		StringManipulation reverse = (str) -> {		
			return new StringBuffer(str).reverse().toString();
		};
		StringManipulation capitalize = (str) -> {		
			return str.toUpperCase();
		};
		// Output: omeD adbmaL
		System.out.println(modifyStr(reverse, "Lambda Demo")); 
		// Output: LAMBDA DEMO
		System.out.println(modifyStr(capitalize, "Lambda Demo")); 
	}
}
