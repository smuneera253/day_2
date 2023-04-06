/*class duplicate
{
	public static void main(String[]args)
	{
		int[] arr = {1,4,5,2,1,3,4,5,};
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count+=1;
				}
				
			}
		}
		System.out.println(count);
	
	}
}*/


class duplicate
{
	public static void main(String[]args)
	{
		int [] arr = {1,4,2,2,1,4,1,2,1,2,1};
		
		
		System.out.println(countDuplicate(arr));
		
		
		
	}
	public static int countDuplicate(int[] arr)
	{
		
		//int[] arr = {1,4,5,2,1,3,4,5,};
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count+=1;
					break;
				}
				
			}
		}
		return count;
	}
}
