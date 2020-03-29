package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-16 1:32
 */
public class SpecialNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                String target = Integer.toString(i);
                if (target.indexOf("2") != -1 || target.indexOf("0") != -1
                        || target.indexOf("1") != -1
                        || target.indexOf("9") != -1) {
                    sum += i;
                }
            }
            System.out.println(sum);
    }

}
