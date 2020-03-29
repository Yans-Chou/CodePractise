package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-03 22:23
 */
public class TypeTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String a = key.next();
        String b = key.next();
        if(a.length()!=b.length()){
            System.out.println("1");
        }else if(a.equals(b)){
            System.out.println("2");
        }else if(a.toUpperCase().equals(b.toUpperCase())){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
