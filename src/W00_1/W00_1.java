package W00_1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Created by xiny on 2015/2/25.
 */
public class W00_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double N = (double)in.nextInt();
        String a = in.next();
        char b = a.charAt(0);
        double n = sqrt((N + 1) / 2);
        int k = (int)n;
        for(int i=k;i>0;i--){
            for(int j=0;j<(k-i);j++)
                System.out.print(" ");
            for(int j=0;j<(2*i-2);j++)
                System.out.print(b);
            System.out.println(b);
        }
        for(int i=2;i<=k;i++){
            for(int j=0;j<(k-i);j++)
                System.out.print(" ");
            for(int j=0;j<(2*i-2);j++)
                System.out.print(b);
            System.out.println(b);
        }
        System.out.println((int)N-k*k*2+1);
    }
}
