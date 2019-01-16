package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/16
 */
public class q8 {

    //best java version
    public int myAtoi1(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(index < str.length() && str.charAt(index) == ' ')
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }

    //my answer
    public static int myAtoi(String str) {
        int count = 0;
        int result = 0;
        StringBuilder res_s = new StringBuilder();
        while (count < str.length() && str.charAt(count) == ' ') {
            count++;
        }
        if (count >= str.length()) {
            return 0;
        }
        if ((str.charAt(count) >= '0' && str.charAt(count) <= '9') || str.charAt(count) == '+' || str.charAt(count) == '-') {
            res_s.append(str.charAt(count));
            count++;
            while (count < str.length() && (str.charAt(count) >= '0' && str.charAt(count) <= '9')) {
                res_s.append(str.charAt(count));
                count++;
            }
        } else {
            return 0;
        }
        try {
            result = Integer.parseInt(res_s.toString());
        } catch (NumberFormatException e) {
            if (res_s.length() == 1) {
                return 0;
            } else {
                if (res_s.charAt(0) == '-') {
                    result = Integer.MIN_VALUE;
                } else {
                    result = Integer.MAX_VALUE;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int test = myAtoi("2147483648");
        System.out.println(test);
    }
}
