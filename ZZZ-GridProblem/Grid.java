package GridProblem;

import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[][] gridMat=new int[t][t];
        int value=0;
        int top=0,button=t-1,left=0,right=t-1, dir=0;
        while(top<=button && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    gridMat[top][i]=value;
                    value++;
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=button;i++){
                    gridMat[i][right]=value;
                    value++;
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    gridMat[button][i]=value;
                    value++;
                }
                button--;
            }
            else if(dir==3){
                for(int i=button; i>=top;i--){
                    gridMat[i][left]=value;
                    value++;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        for(int i=0;i<t;i++){
            System.out.println("\n");
            for(int j=0;j<t;j++){
                System.out.print(gridMat[i][j]+" ");

            }
        }
    }
}