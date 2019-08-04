package varaibles;

import java.util.Scanner;

public class MyScannerInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your Number");
		int my_Enter_Number = scan.nextInt();
		System.out.println(" Your Number is "+my_Enter_Number);
		scan.close();
		*/
		
		Scanner scanString 	=new Scanner(System.in);
		System.out.println("Enter Your Number");
		String  my_String = scanString.nextLine();
		System.out.println(" Your String is "+my_String);
		scanString.close();
		
	}

}
