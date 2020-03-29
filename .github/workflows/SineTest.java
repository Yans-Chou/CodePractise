package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-11 17:44
 */
public class SineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getSn(n);

    }

    public static void getAn(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print("sin("+i);
            if(i%2==0&&i!=n){
                System.out.print("+");
            }
            if(i%2==1&&i!=n){
                System.out.print("-");
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(")");

        }
    }
    public static void getSn(int n) {
        for (int i = 0; i <n-1 ; i++) {
            System.out.print("(");
        }
        for (int i = 1; i <=n ; i++) {
            getAn(i);
            System.out.print("+"+(n-i+1));
            if(n!= i){
                System.out.print(")");
            }
        }

    }


}

