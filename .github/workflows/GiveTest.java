package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-13 23:06
 */
public class GiveTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();
        int i;
        for ( i = 1; i <a*b*c ; i++) {
            if(i%a==0&&i%b==0&&i%c==0)
                break;
        }
        System.out.println(i);
    }
}
