package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/25
 */
public class CalSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < input.length(); i++) {
                for (int j = i + 1; j < input.length() + 1; j++) {
                    String temp = input.substring(i, j);
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, 1);
                    }
                }
            }
            List<Map.Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
            entry.sort(Comparator.comparing(Map.Entry::getKey));
            for (Map.Entry<String, Integer> i : entry) {
                if (i.getValue() >= 2) {
                    System.out.println(i.getKey() + " " + i.getValue());
                }
            }
        }
    }
}
