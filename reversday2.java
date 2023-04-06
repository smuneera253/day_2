
class HelloWorld {
    
    public static String str="Welcome to the JTBB bootcamp".toLowerCase();
    //convert str into arr;
    
    public static char[] arr = str.toCharArray();
    
    public static void main(String[] args)
    {
    	
        //System.out.println(arr);
        //System.out.println(wordcount( 0, arr ) );
        //ReverseSubString(0 , arr.length-1 , arr);
        //System.out.println(arr);
       
        int wordStart=0;
        int wordend=0;
        while((wordend=wordcount(wordStart,arr))!=-1){
            ReverseSubString(wordStart, wordend-1,arr);
            wordStart= wordend+1;
        }
        System.out.println(arr);
            
    
    
    }
    
    
    //word count
    public static int wordcount(int start ,char[] arr)
    {
        if(start >= arr.length){
            return -1;
        }
        int wordEnd = start;
        while( wordEnd<arr.length && arr[wordEnd] != ' ')
        {
          wordEnd++;
        }
    return wordEnd;
    }
    
    public static void ReverseSubString(int start , int end ,char[] arr)
    {
        if(arr == null)
        {
            return;
        }
        while (start <= end)
        {
            char temp = arr [start];
            arr [start] = arr [end];
            arr [end] = temp;
            start ++;
            end --;
        }
    }
    
}


