package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/29
 */
public class CountPrimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        for(int i = 2;i <= n;i++){
            while(n % i == 0){
                count++;
                n = n / i;
            }
        }
        System.out.println(count);
    }
}
