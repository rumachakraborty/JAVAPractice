package Youtube_Naven_JavaInterview_25_Sdet_30;

public class VidSDET18_MixMinInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,100,220,30,9978,1,0};
		int min=a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]<min){
			min=a[i];
		}
		}
		System.out.println("minimum element from array is:" +min);

	}

}
