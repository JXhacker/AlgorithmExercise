package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/27
 */
public class Tap_TimeSpend {
    private static int timeSpend(String s, Map<Character, Integer> map, Map<Character, Integer> map2) {
        int length = s.length();
        if (length == 0) return length;
        if (length == 1) return map2.get(s.charAt(0));
        int ans=map2.get(s.charAt(0));
        for (int i = 1; i < length; i++) {
            if (map.get(s.charAt(i)).equals(map.get(s.charAt(i - 1)))) {
                ans = ans + map2.get(s.charAt(i))+2;
            } else {
                ans = ans + map2.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int count = 2;
        List<Character> turnPoint = Arrays.asList('d', 'g', 'j', 'm', 'p', 't', 'w');
        for (char i = 'a'; i <= 'z'; i++) {
            if (turnPoint.contains(i)) {
                count++;
            }
            map.put(i, count);
        }
        int tapNum=1;
        for (char i = 'a'; i <= 'z'; i++) {
            if (turnPoint.contains(i)) {
                tapNum=1;
            }
            map2.put(i, tapNum);
            tapNum++;
        }
        while (sc.hasNext()) {
            s = sc.nextLine();
            System.out.println(timeSpend(s, map, map2));
        }
    }
}
