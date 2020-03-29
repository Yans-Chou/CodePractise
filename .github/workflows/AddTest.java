package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-03 20:45
 */
public class AddTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] a = new int[101];
        int[] b = new int[101];
        int[] c = new int[101];
        String aa = key.next();
        String bb = key.next();
        int i, j = 0, k, t = 0;

        for (i = 0; i < aa.length(); i++) {
            a[i] = aa.charAt(aa.length() - 1 - i) - 48;//必须-48，将ASCII码转换
        }
        for (i = 0; i < bb.length(); i++) {
            b[i] = bb.charAt(bb.length() - 1 - i) - 48;
        }
        for (i = 0; i < 101; i++) {
            k = a[i] + b[i] + j;
            j = k / 10;
            c[i] = k % 10;
        }
        for (i = c.length - 1; i >= 0; i--) {
            if (c[i] != 0) {
                t = i;
                break;
            }
        }
        for (i = t; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }


}
