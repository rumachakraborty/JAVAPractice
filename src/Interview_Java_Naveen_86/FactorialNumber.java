package Interview_Java_Naveen_86;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//!15=5*4*3*2*1=120
		//!4=4*3*2*1=24
		
		int num=3;
		getFact(num);
		

	}
	
	public static void getFact(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
			
		}
		System.out.println("factorial  of "+num+ "is:" +fact);
	}

}
