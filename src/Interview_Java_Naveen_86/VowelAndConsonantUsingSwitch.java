package Interview_Java_Naveen_86;

public class VowelAndConsonantUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
			System.out.println(ch + "  is vowel");
			break;
			default:

				System.out.println(ch + "  is consonant");
		}

	}

}
