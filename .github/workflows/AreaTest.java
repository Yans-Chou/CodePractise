package Lanqiao;

import java.util.Arrays;
        import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-05 17:01
 */
public class AreaTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double x[]=new double[4];
        double y[]=new double[4];
        for (int i = 0; i <4 ; i++) {
            x[i] = key.nextDouble();
            y[i]=key.nextDouble();
        }
        double minx,maxx,miny,maxy;
        if(x[0]>x[3]){
            minx=Math.min(x[0],x[1]);
            maxx=Math.max(x[2],x[3]);
        }else{
            minx=Math.min(x[2],x[3]);
            maxx=Math.max(x[0],x[1]);
        }
        if(y[0]>y[3]){
            miny=Math.min(y[0],y[1]);
            maxy=Math.max(y[2],y[3]);
        }else{
            miny=Math.min(y[2],y[3]);
            maxy=Math.max(y[0],y[1]);
        }

        double s;
        if(minx>maxx||miny>maxy){
            s=0.00;
        }
        else{
            Arrays.sort(x);
            Arrays.sort(y);
            s=(x[2]-x[1])*(y[2]-y[1]);
        }
        System.out.printf("%.2f",s);
    }

}
