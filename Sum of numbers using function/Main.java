import java.util.Scanner;
class Main{
	 public static int sm(int n)
  {
       int sum=0;
       for(int i=1;i<=n;i++)
       {
         sum=sum+i;
       }
   return sum;
  }
  
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sm(n);
      System.out.print(sum);
	 
	}
}