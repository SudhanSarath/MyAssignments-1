package Week2.day2;

import java.util.Arrays;

public class findMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]={1, 4, 3, 2, 8, 6, 7};

      int sum1=0;
		for (int i=0; i<a.length; i++) {
		    sum1=sum1+a[i];
						
		}
		System.out.println(sum1);
	  int sum2=0;
	   for (int j=0; j<=8; j++)
	   {
		   sum2=sum2+j;
	   }
	   System.out.println(sum2);
	   
	   System.out.println("Missing Element is: " + (sum2-sum1));
	}
	

}
