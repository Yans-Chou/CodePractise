package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-03 22:15
 */
public class TimeFormatTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int time = key.nextInt();
        int h=time/3600;
        int m=(time-h*3600)/60;
        int s=time-h*3600-m*60;
        System.out.println(  h + ":" + m + ":"  + s );
    }
}
