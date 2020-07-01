package Youtube_Naven_JavaInterview_25_Sdet_30;

public class VidSDET14_Array_EvenOddFromArray_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5,6,10,11};
		//extracting even from array
		System.out.println("even number list from array list");

		for(int value:a){
			if(value%2==0){
				System.out.println(value);
			}
		}
			//extracting even from array
			
			System.out.println("Odd number list from array list");

			for(int value:a){
				if(value%2!=0){
					System.out.println(value);
				}
			}

	}

	}

