package Interview_Java_Naveen_86;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//153->1*1*+5*5*5+3*3*=1+125+27=153
		//371
		
		int num=159;
		int actualNum=num;
		double result=0;
		while(actualNum!=0){
			int n=actualNum%10;
			result=result+Math.pow(n, 3);
			actualNum=actualNum/10;
			
		}
		if(result==num){
			System.out.println(num+ " is an armStrong NUmber");
		}
		else{
			System.out.println(num+ " is not an armStrong NUmber");

		}
	}

}
