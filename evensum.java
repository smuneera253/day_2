/*class main
{
	public static void main(String[]args)
	{
		int [] arr={2,5,4,3,8,7};
		int number=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				number*=arr[i];
			
			}
		}
		System.out.println(number);
		
	}
}*/

class main
{
	public static void main(String[]args)
	{
		int [] arr={2,5,4,3,8,7};
		System.out.println(productSumeven(arr));
	
	}
	
	public static int productSumeven(int []arr)
	{
		int number=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				number*=arr[i];
			
			}
		}
		return number;
		
	}
}
	
