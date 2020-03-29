package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-04 9:43
 */
public class MatrixTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int m = key.nextInt();
        int a[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=key.nextInt();
            }

        }

        int res[][] = a.clone();
        int t[][]=a.clone();
      final  int s[][]=a.clone();

           for (int i = 1; i < m; i++) {
               res = getRes(t, s);
               t = res;
       }

           if(m>0) {
               for (int i = 0; i < n; i++) {
                   for (int j = 0; j < n; j++) {
                       System.out.print(res[i][j] + " ");
                   }
                   System.out.println();
               }
           }else{
               int b[][]=new int[n][n];
               for (int i = 0; i < n; i++) {
                   for (int j = 0; j < n; j++) {
                       if (i == j) {
                           b[i][j] = 1;
                       }
                       System.out.print(b[i][j] + " ");
                   }
                   System.out.println();
               }

                   }

           }

    public  static int[][] getRes(int a[][],int b[][]){
        int m=a.length;
        int n=b.length;
         int c[][]=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                int sum=0;
                for (int k = 0; k <n ; k++) {
                    sum+=a[i][k]*b[k][j];

                }
                   c[i][j]=sum;
            }
        }
           return c;
    }
}
