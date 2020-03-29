package Lanqiao;

import java.util.Scanner;

/**
 * @author Zhouyan
 * @create 2020-03-16 13:31
 */
public class WaimaiTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//店家数
        int M = input.nextInt();//信息数
        int T = input.nextInt();//时间数
        int ans = 0;
        boolean pri[] = new boolean[N + 1];
        int danzi[][] = new int[N + 1][T + 1];//第一个是店家ID，第二个是时间，值则为优先级
        for (int i = 0; i < M; i++) {
            int ts = input.nextInt();
            int id = input.nextInt();
            danzi[id][ts]++;//录入了
        }
        //要算的是，每个店家每个时刻的优先级。
        for (int t = 1; t <= T; t++)//按每个时间进行外部遍历
        {
            for (int s = 1; s < N + 1; s++)//内部是每个时间的店家的遍历
            {
                int temp = danzi[s][t];//用于记录t时刻s店的订单数量
                if (temp != 0) {
                    danzi[s][t] = danzi[s][t - 1] + temp * 2;//店家s在t时刻的优先级
                    if (!pri[s] && danzi[s][t] > 5)//加过之后大于5进入优先级
                        pri[s] = true;
                } else {
                    if (danzi[s][t - 1] > 0)
                        danzi[s][t] = danzi[s][t - 1] - 1;
                    if (pri[s] && danzi[s][t] <= 3)
                        pri[s] = false;
                }
            }
        }
        for (int i = 1; i < N + 1; i++)
            if (pri[i]) {
                ans++;
            }
        System.out.println(ans);
    }
}
