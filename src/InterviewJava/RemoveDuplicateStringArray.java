package InterviewJava;

import java.util.Arrays;

public class RemoveDuplicateStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] strColours={
				"red",
				"red",
				"blue",
				"green"
				
		};
		strColours=Arrays.stream(strColours).distinct().toArray(String[]::new);
		System.out.println("array after removal dupliactes:" + Arrays.toString(strColours));
	}

}
