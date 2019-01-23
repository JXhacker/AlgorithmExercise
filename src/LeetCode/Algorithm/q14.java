package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/21
 */
public class q14 {

    //best java version
    public static String longestCommonPrefix1(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }

    //my version
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length==0||(strs.length == 1 && strs[0].length()==0)) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }
        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i)!=strs[0].charAt(i)){
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] strings={"a"};
        System.out.println(longestCommonPrefix(strings));
        //System.out.println(strings.length);
    }
}
