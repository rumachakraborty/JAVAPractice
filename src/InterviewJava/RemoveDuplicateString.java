package InterviewJava;

import java.util.HashSet;
import java.util.Set;
//https://www.youtube.com/watch?v=k20wLXEVZr8

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sandeep";
		System.out.println(removeDuplicate(str));
		

	}

	public static String removeDuplicate(String str){
	Set<Character> set=new HashSet<>();
	StringBuffer sf=new StringBuffer();
	
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);//str.chartAt(0)->s
			if(!set.contains(c)){  //if s is not contain in hashset
				set.add(c);  // add s to set
				sf.append(c);   // add s to string
			}
		}
		
		return sf.toString();
	}
}
