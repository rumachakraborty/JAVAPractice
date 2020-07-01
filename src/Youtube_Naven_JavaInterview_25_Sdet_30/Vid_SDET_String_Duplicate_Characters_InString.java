package Youtube_Naven_JavaInterview_25_Sdet_30;

import java.util.HashMap;
import java.util.Map;
//https://www.youtube.com/watch?v=TZkKevbnrQg&t=34s
public class Vid_SDET_String_Duplicate_Characters_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ruma Chakraborty";
		char[] chars=str.toCharArray();
		//System.out.println(chars);
		Map<Character,Integer> charMap=new HashMap<>();
		
		for(Character ch:chars)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		//loop through only keys
		//Set<Character>

	}

}
