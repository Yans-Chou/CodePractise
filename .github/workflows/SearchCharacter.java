package Lanqiao;

import java.util.Scanner;
/**
 * @author Zhouyan
 * @create 2020-03-17 17:07
 */
public class SearchCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int K = input.nextInt();
        input.nextLine();
        String text = input.nextLine();
        //字符串分割，按照空格和.分割字符，若是（.空格）分割后为空字符串。
        String[] words = text.split("\\s+|\\.");
        int[] wordsLength = new int[words.length];
        //将分割的字符串的长度值存储，避免三重循环中调用String.length();
        for (int i = 0; i < words.length; i++) {
            wordsLength[i] = words[i].length();
        }
        int num = 0;
        //Alice ——> Bob的距离
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Alice")) {
                for (int j = i + 1; j < words.length; j++) {
                    int sum = 1;
                    if (words[j].equals("Bob")) {
                        for (int k = i + 1; k < j; k++) {
                            //每个单词的长度加空格占据的长度
                            sum += wordsLength[k] + 1;
                        }
                        if (sum <= K) {
                            num++;
                        }
                    }
                }
            }
        }
        //Bob ——> Alice的距离
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Bob")) {
                for (int j = i + 1; j < words.length; j++) {
                    int sum = 1;
                    if (words[j].equals("Alice")) {
                        for (int k = i + 1; k < j; k++) {
                            sum += wordsLength[k] + 1;
                        }
                        if (sum <= K) {
                            num++;
                        }
                    }
                }
            }
        }
        System.out.println(num);
    }
}
