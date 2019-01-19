package LeetCode.Algorithm;

import java.util.HashMap;

/**
 * @author wanzhiwen
 * @time 2019/1/19
 */
public class q12 {

    //best java version
    public static String intToRoman1(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    //my answer(wrong answer)
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for (String key1 : map.keySet()) {
            for (String key2 : map.keySet()) {
                if (map.get(key1) > map.get(key2)) {
                    map2.put(map.get(key1) - map.get(key2), key2 + key1);
                }
            }
        }
        if (map2.containsKey(num)) {
            return map2.get(num);
        }
        if (num / 1000 != 0) {
            for (int i = 0; i < num / 1000; i++) {
                res.append('M');
            }
            num = num - num / 1000 * 1000;
        }
        if (num / 500 != 0) {
            for (int i = 0; i < num / 500; i++) {
                res.append('D');
            }
            num = num - num / 500 * 500;
        }
        if (num / 100 != 0) {
            for (int i = 0; i < num / 100; i++) {
                res.append('C');
            }
            num = num - num / 100 * 100;
        }
        if (num / 50 != 0) {
            for (int i = 0; i < num / 50; i++) {
                res.append('L');
            }
            num = num - num / 50 * 50;
        }
        if (num / 10 != 0) {
            for (int i = 0; i < num / 10; i++) {
                res.append('X');
            }
            num = num - num / 10 * 10;
        }
        if (num / 5 != 0) {
            for (int i = 0; i < num / 5; i++) {
                res.append('V');
            }
            num = num - num / 5 * 5;
        }
        if (num != 0) {
            for (int i = 0; i < num; i++) {
                res.append('I');
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = intToRoman1(1994);
        System.out.println(s);
    }
}
