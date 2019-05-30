import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g1=great(n1,n2);
      if(g1>n3)
        System.out.print(g1);
      else 
        System.out.print(n3);
      
      
      
	}
  public static int great(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
  
}