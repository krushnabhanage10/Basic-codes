import java.util.Scanner;
class Main{
    public static int prime(int n)
      {
      int i,number,count;
        for(number = 1; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.println(number + " ");
		    }  
		}
        return 0;
      }
  
	public static void main (String[] args){
    
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      prime(m);
	}
}