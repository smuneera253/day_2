/*class fact1 {
    public static void main(String[] args) {
        int num = 5;
        
        int factorial = 1;
        
        for (int i =1; i <= num; i++)
        {
            factorial = i * factorial;
        }
        
        System.out.println(factorial);
 
    }
}*/


class fact1 
{
    public static void main(String[] args) 
    {
    	int num=5;
    	System.out.println(findFactorial( num));
    }
    public static int findFactorial(int num)
    {
    	int factorial = 1;
        
        for (int i =1; i <= num; i++)
        {
            factorial = i * factorial;
        }
        return factorial;
    
    }
    
}   	
