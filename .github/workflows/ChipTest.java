package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-11 18:38
 */
public class ChipTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] test = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = in.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i <n ; i++) {
            count=0;
            for (int j = 0; j <n ; j++) {
                  if(test[j][i]==1){
                      count++;
                  }
            }
                  if(count>n/2){
                      System.out.print((i+1)+" ");
                  }


        }

    }
}
