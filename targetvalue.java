class targetvalue
{
	public static void main(String[]args)
	{
		int[] arr = {2,3,4,6,8,1};
		int target = 10;
		System.out.println(targest(arr,target));
		
	}
	public static String targest(int[] arr,int target)
	{
		String flag = "no:"+"sum is not equal to target";
		
		for(int i = 0;i < arr.length-1;i++)
		{
			for(int j = i + 1;j < arr.length;j++)
			{
				if(arr[i] + arr[j] == target)
				{
					flag ="The index value of" +i+","+j+" = "+target;
					break;
				}
				
			
			}
		}
		return flag;
		
	}
}
