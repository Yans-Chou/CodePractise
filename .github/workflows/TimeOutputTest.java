package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-03 21:15
 */
public class TimeOutputTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
       int h = key.nextInt();
       int m= key.nextInt();
       String a[]={"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen", "twenty","twenty one","twenty two","twenty three","thirty","forty","fifty"};
       if(m==0){
           System.out.println(a[h] + " o'clock");
       }

      else if(m<=23){
           System.out.println(a[h] + " " + a[m]);
       }
      else if(m>23&&m<30){
           System.out.println(a[h] + " twenty " + a[m % 10]);
       }
      else if(m>20&&m%10==0){
           System.out.println(a[h] + " " + a[m / 10 + 21]);
       }else{
           System.out.println(a[h] + " " + a[m / 10 +21] + " " + a[m % 10]);
       }
    }
}
