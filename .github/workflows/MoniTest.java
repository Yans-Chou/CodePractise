package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-21 10:28
 */
public class MoniTest {
    public static void main(String[] args) {
       int count=0;
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 1; i <=n ; i++) {
            count++;
            for(int j=n-i-1;j>0;j--){
                count++;
            }
            
        }
        System.out.println(count);
    }
}