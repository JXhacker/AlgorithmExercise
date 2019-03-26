package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/26
 */
public class ReverseString {
    private static String reverse(String s){
        StringBuilder target=new StringBuilder();
        for(int i=3;i>=0;i--){
            target.append(String.valueOf(s.charAt(i)));
        }
        return target.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            System.out.println(reverse(input));
        }
    }
}
