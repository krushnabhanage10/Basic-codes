import java.util.Scanner;
class Main{
    public static int prime(int m,int n)
      {
        int count=1;
      for(int i=1;i<=n;i++){
       count=count*m;}
      return count;
      }
  
	public static void main (String[] args){
    
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
      int power=prime(m,n);
      System.out.print(power);
	}
}