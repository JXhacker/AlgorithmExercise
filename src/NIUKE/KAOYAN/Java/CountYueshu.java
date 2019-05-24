package NIUKE.KAOYAN.Java;
import java.util.*;
/**
 * @author wanzhiwen
 * @time 2019/3/26
 */
public class CountYueshu {
    private static int countyueshu(int number){
        int count=0;
        for(int i=1;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                count++;
                if(number/i != i){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            number=sc.nextInt();
            System.out.println(countyueshu(number));
        }
    }
}
