package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-13 22:42
 */
public class RunningRaceTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int t = in.nextInt();
        int s = in.nextInt();
        int l = in.nextInt();

        int t1=0;
        int t2=0;
        int l1=0;
        int l2=0;
        while(l1<l&&l2<l){
            if(l1-l2>=t){
                t2 += s;//乌龟的时间直接+s，相当于兔子直接休息好了，两个动物又开始追逐
                l1 = v1 * t1;// 其实此时t1并没有变，相当于l1不变
                l2 = v2 * t2;//表示此时乌龟在兔子休息了s秒共跑了多长的路程
            }else{
                t1++;//兔子时间每秒的增加
                t2++;//乌龟时间每秒的增加
                l1 = v1 * t1;//兔子跑的总路程
                l2 = v2 * t2;//乌龟跑的总路程
            }
        }

        if(l1==l2){
            System.out.println("D");
            System.out.println(t2);
        }else if(l2>l1){
            System.out.println("T");
            System.out.println(l/v2);
        }else{
            System.out.println("R");
            System.out.println(t2);
        }

    }
}
