package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-06 20:59
 */
public class FJStringTest {
    static String arr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        String s=getRes(n);
        System.out.println(s);
    }

    public static String getRes(int n){
       String s = null;
        if(n==1){
            s="A";
        }else{
            s=getRes(n-1)+arr.charAt(n-1)+getRes(n-1);
        }

        return s;
    }
}
