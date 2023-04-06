/*class palindrom
{
	public static void main(String[]args)
	{
		String str = "amma";
		
		int start = 0;
		
		int end = str.length()-1;
		
		String flag = "Palindrom";
		
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end)	)
			{
				flag = "not a palindrom";
			}
			break;
		}
		System.out.print(flag);
	
	}
}*/

class palindrom
{
	public static void main(String[]args)
	{
	
		String str = "amma";
		System.out.println(str);
	
	}
	public static String findPalindrom(int start,int end,String str)
	{
		//int start=0;
		//int end=str.length()-1;
		String flag="Palidrom";
		
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				flag="not a Palidrom";
			}
			break;
		}
		return flag;
	}
}	
