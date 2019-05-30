import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
     int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
     int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        b[i][j]=in.nextInt();
      }
    }
    int res=iden(r,c,a,b);
    if(res==1)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
  public static int iden(int r,int c,int[][] a,int[][] b)
  {
    int res=1;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if( a[i][j]!=b[i][j])
          res=0;
      }
    } 
    return res;
  }
}



