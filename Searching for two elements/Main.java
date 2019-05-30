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
      int n1=in.nextInt();
      int n2=in.nextInt();
      int p=-1,q=-1;
      for(int j=0;j<n;j++)
      {
        if(arr[j]==n1)
        { p=j;
       for(int k=0;k<n;k++)
      {
       if(arr[k]==n2)
         q=k;
      } }
        
      }
      System.out.println(p);
      System.out.println(q);
    }
}