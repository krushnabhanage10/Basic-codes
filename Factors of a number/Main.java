import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(n%i==0)
          System.out.println(i);
      }
	}
}