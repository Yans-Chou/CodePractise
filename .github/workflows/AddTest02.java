package Lanqiao;

import java.math.BigInteger;
import java.util.Scanner;


public class AddTest02 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String aa = key.next();
        String bb = key.next();
        BigInteger a=new BigInteger(aa);
        BigInteger b=new BigInteger(bb);
        BigInteger sum=a.add(b);
        System.out.println(sum);

    }
}
