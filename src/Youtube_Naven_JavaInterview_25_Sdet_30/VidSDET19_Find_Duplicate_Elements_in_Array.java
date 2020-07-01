package Youtube_Naven_JavaInterview_25_Sdet_30;

public class VidSDET19_Find_Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]={"c","Java","Python","Java","Rubi","C++","C#"};
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Found duplicate element is a array:" +a[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false){
		System.out.println("Duplicate elements not found:");
		}

	}

}
