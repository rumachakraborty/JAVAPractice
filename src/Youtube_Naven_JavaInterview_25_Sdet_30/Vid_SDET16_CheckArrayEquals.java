package Youtube_Naven_JavaInterview_25_Sdet_30;

import java.util.Arrays;

public class Vid_SDET16_CheckArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]={1,2,3,4,5,9};
		int a2[]={1,2,3,4,5};
		
		boolean status=Arrays.equals(a1, a2);
		if(status==true){
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Arrays are Not equal");
		}

	}

}
