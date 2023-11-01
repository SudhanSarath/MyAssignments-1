package Week2.day2;

public class OddIndextoUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		
		 char[] CharArray = test.toCharArray();
		 
		 for (int i=0; i<CharArray.length; i++) {
			 if (i%2==1) {

				 CharArray[i]=Character.toUpperCase(CharArray[i]);
				 				 
				 			 }
				 				System.out.println(CharArray);
			 
			 		 }
		 
			 	}

}
