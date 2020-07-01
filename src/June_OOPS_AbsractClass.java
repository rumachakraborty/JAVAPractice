
abstract class A{
	void m1(){
		System.out.println("m1");
	}
	abstract void m2();
	abstract void m3();
}

class B extends A{

	@Override
	void m2() {
		System.out.println("m2");
		
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");	
	}
	
}



public class June_OOPS_AbsractClass {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
A a=new B();
a.m1();
a.m2();
a.m3();
	}

}
