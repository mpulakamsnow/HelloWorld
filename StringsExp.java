package varaibles;

public class StringsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="Hello World";
		int myLength=myString.length();
		
		String  myLcase=myString.toLowerCase();
		String  myUcase=myString.toUpperCase();
		String myReplace=myString.replace('e', 'a');
		
		System.out.println(myLength);
		System.out.println(myLcase);
		System.out.println(myUcase);
		System.out.println(myReplace);
		System.out.println(myString.indexOf('o'));
		
	}

}
