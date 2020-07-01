
public class Test13thMay_LargeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=100;
		int c=100;
		if(c==a && c==b && c>a && c>b){
			System.out.println(c + " is Larger then " +a + " &" +b);
		}else if(a>=b && a>=c){
			System.out.println(a + " is Larger then " +b + " &" +c);
		}else if(b>=a && b>=c){
			System.out.println(b + " is Larger then " +a + " &" +c);
		}else if(a==b && a==c){
			System.out.println(a + "," +b +"," +c + " all are equal");
		}

	}
}

