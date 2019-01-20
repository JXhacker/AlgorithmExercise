package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/20
 */
public class q13 {

    //best java version
    public static int romanToInt1(String s) {
        int sum = 0;
        if (s.indexOf("IV") != -1) {
            sum -= 2;
        }
        if (s.indexOf("IX") != -1) {
            sum -= 2;
        }
        if (s.indexOf("XL") != -1) {
            sum -= 20;
        }
        if (s.indexOf("XC") != -1) {
            sum -= 20;
        }
        if (s.indexOf("CD") != -1) {
            sum -= 200;
        }
        if (s.indexOf("CM") != -1) {
            sum -= 200;
        }

        char c[] = s.toCharArray();
        int count = 0;

        for (; count <= s.length() - 1; count++) {
            if (c[count] == 'M') sum += 1000;
            if (c[count] == 'D') sum += 500;
            if (c[count] == 'C') sum += 100;
            if (c[count] == 'L') sum += 50;
            if (c[count] == 'X') sum += 10;
            if (c[count] == 'V') sum += 5;
            if (c[count] == 'I') sum += 1;
        }

        return sum;

    }

    //my answer
    public static int romanToInt(String s) {
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] strs = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int answer = 0;
        int i;
        for (i = 0; i < s.length(); ) {
            int flag = 0;
            for (int j = 0; j < strs.length; j++) {
                if (i < s.length() - 1 && s.substring(i, i + 2).equalsIgnoreCase(strs[j])) {
                    flag = 1;
                    answer = answer + nums[j];
                    i = i + 2;
                    break;
                }
            }
            if (flag != 1) {
                for (int j = 0; j < strs.length; j++) {
                    if (s.substring(i, i + 1).equalsIgnoreCase(strs[j])) {
                        answer = answer + nums[j];
                        i = i + 1;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    //MCMXCIV 1994
    public static void main(String[] args) {
        System.out.println(romanToInt1("IVIV"));
        //System.out.println("IV".substring(0,2));
    }
}
