package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-12 21:57
 */
public class CircleNumsTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
       int a[][]=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int t=0;//作用：用于退出循环  当t<元素个数时读数结束，同时每次读一个数就将t递增1
        int x=-1,y=0;
        while(t<m*n) {
            while (x+1 < m && a[x+1][y] !=-1) {
                System.out.print(a[++x][y]+" ");
                a[x][y]=-1;
                ++t;
            }
            while (y+1 < n && a[x][y+1] !=-1) {
                System.out.print(a[x][++y]+" ");
                a[x][y]=-1;
                ++t;
            }
            while (x-1>=0 && a[x-1][y] !=-1) {
                System.out.print(a[--x][y]+" ");
                a[x][y]=-1;
                ++t;
            }

            while (y-1>= 0 && a[x][y-1] !=-1) {
                System.out.print(a[x][--y]+" ");
                a[x][y]=-1;
                ++t;
            }


        }
}
}
