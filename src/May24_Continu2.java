
public class May24_Continu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before loop");
		for(int i=0;i<=10;i++){
			System.out.println("inside loop");
			if(i==5){
				System.out.println("inside loop,before continue");
				continue;
				//System.out.println("inside loop,after continue");
			}
			System.out.println(i);
		}

	}

}
