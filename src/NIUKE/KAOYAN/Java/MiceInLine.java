package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/16
 */

class Mice {
    int weight;
    String hatColor;

    Mice(int weight, String hatColor) {
        this.weight = weight;
        this.hatColor = hatColor;
    }
}

public class MiceInLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        List<Mice> mices;
        while (sc.hasNext()) {
            N = sc.nextInt();
            mices = new ArrayList<>();
            for (int i = 0; i < N; i++){
                mices.add(new Mice(sc.nextInt(), sc.next()));
            }
            mices.sort(new Comparator<Mice>() {
                public int compare(Mice m1, Mice m2) {
                    return m2.weight - m1.weight;
                }
            });
            for (int i = 0; i < N; i++){
                System.out.println(mices.get(i).hatColor);
            }
        }
    }
}
