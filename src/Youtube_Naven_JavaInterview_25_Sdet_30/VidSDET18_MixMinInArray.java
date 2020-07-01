package Youtube_Naven_JavaInterview_25_Sdet_30;

public class VidSDET18_MixMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,100,220,30,9978};
		int max=a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
		}
		System.out.println("Maximim element from array is:" +max);

	}

}
