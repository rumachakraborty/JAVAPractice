package Interview_Java_Naveen_86;

public class FibonacciSeries {
//https://www.youtube.com/watch?v=8Zyru6cZPBg&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=47&t=0s
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13 21
		//Need to practice this in more way
		
		
		int num=10;
		int t1=0;
		int t2=1;
		for(int i=1; i<=num;i++){
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
