package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/3
 */

class Maya{
    String code;
    int times;
    Maya(String code, int times){
        this.code = code;
        this.times = times;
    }
}

public class MayaCode {
    private static int mayaCode(String code, int len) {
        Queue<Maya> que = new LinkedList<>();
        List<String> recode = new ArrayList<>();
        Maya Maya_init = new Maya(code, 0);
        que.add(Maya_init);
        recode.add(code);
        while (!que.isEmpty()) {
            Maya m = que.remove();
            if (m.code.contains("2012")) return m.times;
            for (int i = 0; i <= len - 2; i ++) {
                char[] temp = m.code.toCharArray();
                char temp_ = temp[i];
                temp[i] = temp[i + 1];
                temp[i + 1] = temp_;
                String codeTemp = new String(temp);
                if(!recode.contains(codeTemp)){
                    Maya maya_new = new Maya(codeTemp, m.times + 1);
                    que.add(maya_new);
                    recode.add(codeTemp);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len;
        String code;
        while (sc.hasNext()) {
            len = sc.nextInt();
            code = sc.next();
            System.out.println(mayaCode(code, len));
        }
    }
}
