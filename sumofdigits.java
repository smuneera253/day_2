class main
{
	
	public static void main(String[]args)
	{
		int num=124;
		
		String str=""+num;
		//findSum(String str);
		System.out.println(findSum(str));
		
	}public static int findSum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			sum+=str.charAt(i) - '0';
		}
		return sum;	
	}
	
}
