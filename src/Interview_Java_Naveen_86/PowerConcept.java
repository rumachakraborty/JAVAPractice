package Interview_Java_Naveen_86;

public class PowerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int base=2;
int exponent=4;
long result =1;
while(exponent!=0){
	result *=base;//result*base
	--exponent;
}
System.out.println(result);
	}

}
