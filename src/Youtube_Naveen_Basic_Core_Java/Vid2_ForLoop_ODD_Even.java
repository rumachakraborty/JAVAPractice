package Youtube_Naveen_Basic_Core_Java;

public class Vid2_ForLoop_ODD_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}

		//even no
		for(int even=2;even<=10;even=even+2){
			System.out.println("even num:" +even);
		}
		//odd number
		for(int odd=1;odd<=10;odd=odd+2){
			System.out.println("odd number list:"+odd);
		}
		
		//for -if
		for(int s=1;s<10;s++){
			System.out.println(s);
			if(s==5){
				System.out.println("Hai this is selenium");
			}
			
		}
		for(int s1=1;s1<=10;s1++){
			System.out.println(s1);
			if(s1%5==0){
				System.out.println("Number is divisible by 5");
			}
		}
	}

}
