import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
  Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int mat1[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat1[i][j]=in.nextInt();
      }
    }
   
    trsp(r,c,mat1);
  }
  public static void trsp(int r,int c,int[][] mat1)
  {
    int sub[][]=new int[r][c];
     for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sub[i][j]=mat1[j][i];
      }
    }
     for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(sub[i][j] +" ");
      }
       System.out.println("");
     }
    }
}  
  
  
  
