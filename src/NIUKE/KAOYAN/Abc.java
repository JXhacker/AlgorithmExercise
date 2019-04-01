package NIUKE.KAOYAN;

/**
 * @author wanzhiwen
 * @time 2019/4/1
 */
public class Abc {
    public static void main(String[] args){
        for (int a = 0; a <= 5; a++){
            for (int b = 0; b <= 5; b++){
                for (int c = 0; c <= 9; c++){
                    if ((a + b) * 100 + (b + c) * 10 + 2 * c == 532){
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
