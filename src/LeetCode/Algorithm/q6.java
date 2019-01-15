package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/15
 */
public class q6 {


    //best answer
    public String convert2(String s, int nRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    //my answer
    public static String convert(String s, int numRows) {
        StringBuffer ans = new StringBuffer();
        int rowTraverse;
        if (numRows == 1) {
            return s;
        }
        for (int i = 1; i <= numRows; i++) {
            rowTraverse = i;
            if (i == 1) {
                while (rowTraverse <= s.length()) {
                    ans=ans.append(s.charAt(rowTraverse - 1));
                    rowTraverse = rowTraverse + (numRows - i) * 2;
                }
            } else if (i == numRows) {
                while (rowTraverse <= s.length()) {
                    ans=ans.append(s.charAt(rowTraverse - 1));
                    rowTraverse = rowTraverse + (i - 1) * 2;
                }
            } else {
                while (rowTraverse <= s.length()) {
                    ans=ans.append(s.charAt(rowTraverse - 1));
                    rowTraverse = rowTraverse + (numRows - i) * 2;
                    if (rowTraverse <= s.length()) {
                        ans=ans.append(s.charAt(rowTraverse - 1));
                        rowTraverse = rowTraverse + (i - 1) * 2;
                    } else {
                        break;
                    }
                }

            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String test = "A";
        System.out.println(convert(test, 1));
    }
}
