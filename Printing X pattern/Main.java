import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
       Scanner in=new Scanner(System.in);
      int size=in.nextInt();
       for(int i=0; i < size ;i++)
    {
        //4
        for(int j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
              System.out.print("*");
            }
          else
            System.out.print(" ");
       
          
        }
         System.out.println("");
	}
      
	}
}