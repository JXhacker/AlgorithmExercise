package LeetCode.Algorithm;

import java.util.ArrayList;

/**
 * @author wanzhiwen
 * @time 2019/3/4
 */
public class q43 {

    //Easiest JAVA Solution with Graph Explanation
    public String multiply1(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    //my answer
    public static String multiply(String num1, String num2) {
        int[] list = new int[220];
        int MAX_LOC = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int flag = 0;
            int j = num1.length() - 1;
            int mul, temp, mod;
            for (; j >= 0; j--) {
                mul = Character.getNumericValue(num2.charAt(i)) * Character.getNumericValue(num1.charAt(j));
                temp = list[num1.length() + num2.length() - i - j - 2];
                mod = (mul + temp + flag) % 10;
                list[num1.length() + num2.length() - i - j - 2] = mod;
                if (mod != 0 && num1.length() + num2.length() - i - j - 2 > MAX_LOC)
                    MAX_LOC = num1.length() + num2.length() - i - j - 2;
                flag = (mul + temp + flag) / 10;
            }
            while (flag != 0) {
                temp = list[num1.length() + num2.length() - i - j - 2];
                mod = (temp + flag) % 10;
                list[num1.length() + num2.length() - i - j - 2] = mod;
                if (mod != 0 && num1.length() + num2.length() - i - j - 2 > MAX_LOC)
                    MAX_LOC = num1.length() + num2.length() - i - j - 2;
                flag = (temp + flag) / 10;
                j--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= MAX_LOC; i++) {
            ans.insert(0, String.valueOf(list[i]));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}
