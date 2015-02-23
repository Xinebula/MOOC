package T2_1;

import java.util.Scanner;

/**
 * Created by xiny on 2015/2/23.
 */
public class ReversingLinkedList {
    public static void main(String[] args){
        Nodes[] data = new Nodes[100001];
        int firstNode,N,K;
        Scanner in = new Scanner(System.in);
        firstNode = in.nextInt();
        N = in.nextInt();
        K = in.nextInt();
        data[100000] = new Nodes();//create a head node
        data[100000].Data = -1;
        data[100000].Next = firstNode;
        firstNode = 100000;
        int Address;
        for(int i=0;i<N;i++){
            Address = in.nextInt();
            data[Address] = new Nodes();
            data[Address].Data = in.nextInt();
            data[Address].Next = in.nextInt();
        }
        if (K > 1&&N>0) {
            int p1, p2, p3, p4, p5, p6, p7;//temp data
            p1 = firstNode;
            p2 = data[firstNode].Next;
            outer:
            while (true) {
                if (p1 < 0)
                    break;
                p3 = p1;
                for (int i = 0; i < K; i++) {
                    p3 = data[p3].Next;
                    if (p3 < 0)
                        break outer;
                }
                p4 = data[p3].Next;
                data[p1].Next = p3;
                p5 = p2;
                p6 = p2;
                p7 = data[p6].Next;
                for (int i = 1; i < K; i++) {
                    p6 = p7;
                    p7 = data[p7].Next;
                    data[p6].Next = p5;
                    p5 = p6;
                }
                data[p2].Next = p4;
                p1 = p2;
                p2 = p4;
            }
        }
        int now=data[firstNode].Next;
        while(now>=0){
            if(data[now].Next>=0)
            System.out.printf("%05d %d %05d\n",now,data[now].Data,data[now].Next);
            else
            System.out.printf("%05d %d %d\n",now,data[now].Data,data[now].Next);
            now = data[now].Next;
        }

    }
}
class Nodes{
    int Data;
    int Next;
}