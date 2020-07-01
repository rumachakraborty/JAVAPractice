
class C{
		C(){
			System.out.println("A-con");
		}
		int i=m1();
		int m1(){
			System.out.println("m1-A");
			return 10;
		}
		{
			System.out.println("IB-A");
		}
	}

public class June30Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C a=new C();
	}

}
