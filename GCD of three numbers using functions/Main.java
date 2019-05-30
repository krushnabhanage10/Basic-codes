import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g1=gcd(n1,n2);
      
      int g2=gcd(g1,n3);
        System.out.print(g2);
	}
   public static int gcd(int n1,int n2)
  {
     int gcd=0;
      for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

     return gcd;
    }
}