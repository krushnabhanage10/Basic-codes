import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
    
      for(int j=1;j<n;j++)
      {
        if( arr[0] < arr[j])
          arr[0]=arr[j];
      }
      System.out.println(arr[0]);
    }
}