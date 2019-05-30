import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      Scanner input=new Scanner(System.in);
      int n2=input.nextInt();
      
      if(n2%4==0 && n2%400==0 && n2%100==0 )
      System.out.println("Leap year");
      else
       System.out.println("Non Leap year");
    }
}