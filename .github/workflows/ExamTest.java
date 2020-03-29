package Lanqiao;

/**
 * @author Zhouyan
 * @create 2020-03-16 0:37
 */
public class ExamTest {
    public static void main(String[] args) {
        int a1,a2,a3,b1,b2,b3,b4,c1,c2,c3,c4;
        int sum=0;
        for (int i = 1; i <=673 ; i++) {
            for (int j = i+1; j <=1009 ; j++) {
                for (int k = j+1; k <=1999 ; k++) {
                    if(i+j+k==2019) {
                        a1 = i / 100;a2 = i / 10 % 10;a3 = i % 10;
                        b1 = j / 1000;b2 = j / 100 % 10;b3 = j/10%10;b4=j%10;
                        c1=k/1000;c2=k/100%10;c3=k/10%10;c4=k%10;
                        if(a1!=2&&a1!=4&&a2!=2&&a2!=4&&a3!=2&&a3!=4&&b1!=2&&b1!=4&&b2!=2&&b2!=4&&b3!=2&&b3!=4&&b4!=2&&b4!=4&&c1!=2&&c1!=4&&c2!=2&&c2!=4&&c3!=2&&c3!=4&&c4!=2&&c4!=4){
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }

}
