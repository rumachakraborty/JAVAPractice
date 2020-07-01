package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET3_ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="String reverse program";
		String rev="";
		String[] words=str.split("\\s");
		System.out.println(words);
		for(int i=words.length-1;i>=0;i--){
			rev=rev+words[i]+"";
		}
		System.out.println(rev);

	}

}
