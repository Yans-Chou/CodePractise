package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-03 22:35
 */
public class DividenumTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
       int a = key.nextInt();
       int b = key.nextInt();
        for (int i = a; i <=b ; i++) {
            getPrime(i);

        }


        }


    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void getPrime(int n) {
        String res="";
        int j=2;
        int m=1;
        int k=n;
        if (isPrime(n)) {
            System.out.println(n + "=" + n);
        } else {
            while(m!=n){
                if(isPrime(j)&&k%j==0){
                    res+=j+"*";
                    m*=j;
                    k=n/m;
                }else{
                    j++;
                }
            }
            System.out.println(n+"="+res.substring(0,res.length()-1));
        }
    }
}
