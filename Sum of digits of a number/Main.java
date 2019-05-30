import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int sum=0;
      while(n>0)
      {
        int digit=n%10;
        sum=sum+digit;
        n/=10;
      }
      System.out.println(sum);
    }
}