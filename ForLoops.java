package varaibles;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArrays= {1,2,3,4,5};
		/*
		for (int i=0;i<5;i++) {
			System.out.println(myArrays[i]);
		}
		*/
		
		for(int element:myArrays) {
			System.out.println(element);
		}
	}

}
