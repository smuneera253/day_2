import java.util.*;
class anagram
{
	public static void main(String[]args)
	{
		char[] str1= "angel".toCharArray();
		char[] str2= "kiran".toCharArray();
		//Arrays.sort(str1);
		//Arrays.sort(str2);
		String flag="anagram";
		/*int start1 = 0;
		int start2 = 0;
		while(start1 < str1.length && start2 < str2.length){
			if(str1[start1] != str2[start2]) {
				flag = "not a anagram";
				break;
			}
			start1++;
			start2++;
		}
		System.out.println(flag);
		*/
		// Second Method
		for(int i = 0; i < str1.length; i++){
			for(int j = 0; j < str2.length; j++){
				if(str1[i] == str2[j]){
					str1[i] = '#';
					str2[j] = '#';
				}
			}
		}
		// checking anagram or not;
		for(int i = 0; i < str1.length; i++) {
			if(str1[i] != '#'){
			   flag = "Not a anagram";
			   break;
			}
		}
		System.out.println(flag);
		
	}

}
