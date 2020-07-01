package Java_MarchSession;

public class Vid3_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=20){
			System.out.println(i);
			i=i+2;
		}
		//selenium to write 5 times
		System.out.println("selenium to type 5 times");
		int j=0;
		while(j<5){
			System.out.println("selenium " +j);
			j=j+1;
		}
		
		//for loop
		for (int z=1;z<=10;z=z+1){
			System.out.println("arindam");
		}

		
		
		//for loop
		System.out.println("To display even no");
				for (int even=0;even<=10;even=even+2){
					System.out.println(even);
				}
				
				System.out.println("To display odd no");
				for (int odd=1;odd<=10;odd=odd+2){
					System.out.println(odd);
				}
				//Conditin
				System.out.println("For loop and if else");
				for(int x=0;x<=20;x++){
					System.out.println(x);
					if(x==5){
						System.out.println("I have got 5 and display with 5");
					}
					
				}
	}

}
