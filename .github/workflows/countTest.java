package Lanqiao;
import java.math.BigInteger;

/**
 * @author Zhouyan
 * @create 2020-03-19 22:39
 */
public class countTest{
    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger three = BigInteger.valueOf(3);
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        BigInteger aa ;
        BigInteger bb ;
        for (int i = 0; i <123455 ; i++) {
            aa=a.multiply(two).subtract(b.multiply(three));
            bb=a.multiply(three).add(b.multiply(two));
            a=aa;
            b=bb;
        }
        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}
