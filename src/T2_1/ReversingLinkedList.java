package T2_1;

import java.util.Scanner;

/**
 * Created by xiny on 2015/2/23.
 */
public class ReversingLinkedList {
    public static void main(String[] args){
        int[][] data = new int[100001][2];
        int firstNode,N,K;
        Scanner in = new Scanner(System.in);
        firstNode = in.nextInt();
        N = in.nextInt();
        K = in.nextInt();
        data[100000][0] = -1;
        data[100000][1] = firstNode;
        firstNode = 100000;
        int Address;
        for(int i=0;i<N;i++){
            Address = in.nextInt();
            data[Address][0] = in.nextInt();
            data[Address][1] = in.nextInt();
        }
        if (K > 1&&N>0) {
            int p1, p2, p3, p4, p5, p6, p7;//temp data
            p1 = firstNode;
            p2 = data[firstNode][1];
            outer:
            while (true) {
                if (p1 < 0)
                    break;
                p3 = p1;
                for (int i = 0; i < K; i++) {
                    p3 = data[p3][1];
                    if (p3 < 0)
                        break outer;
                }
                p4 = data[p3][1];
                data[p1][1] = p3;
                p5 = p2;
                p6 = p2;
                p7 = data[p6][1];
                for (int i = 1; i < K; i++) {
                    p6 = p7;
                    p7 = data[p7][1];
                    data[p6][1] = p5;
                    p5 = p6;
                }
                data[p2][1] = p4;
                p1 = p2;
                p2 = p4;
            }
        }
        int now=data[firstNode][1];
        while(now>=0){
            if(data[now][1]>=0)
            System.out.printf("%05d %d %05d\n",now,data[now][0],data[now][1]);
            else
            System.out.printf("%05d %d %d\n",now,data[now][0],data[now][1]);
            now = data[now][1];
        }

    }
}