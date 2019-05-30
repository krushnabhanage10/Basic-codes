import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
    
     
      while(n>=100)
      {n=n/10;}
      int first=n;
      int second=first%10;
     
      System.out.println(second);
	}
}