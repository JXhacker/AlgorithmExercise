package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/16
 */
public class q7 {

    //my answer
    public static int reverse(int x) {
        int temp = x;
        int result = 0;
        int temp_res;
        while (temp != 0) {
            temp_res=result;
            result = result * 10 + temp % 10;
            //overflow return 0;
            if ((result-(temp % 10))/10!=temp_res){
                return 0;
            }
            temp = temp / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int test = reverse(123);
        System.out.println(test);
    }
}
