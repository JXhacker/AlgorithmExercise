package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/31
 */
public class ProxyServer {
    private static int proxyServer(int n, List<String> proxy, int m, List<String> server) {
        boolean flag = true;
        int max, count;
        int start = 0, ans = 0;
        while (flag) {
            max = 0;
            for (int i = 0; i < n; i++) {
                count = 0;
                for (int j = start; j < m; j++) {
                    if (proxy.get(i).equals(server.get(j))) break;
                    count++;
                }
                max = Math.max(max, count);
            }
            if (max == 0) flag = false;
            start = start + max;
            if (start >= m) break;
            ans++;
        }
        if (flag) return ans;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        List<String> proxy = new ArrayList<>();
        List<String> server = new ArrayList<>();
        while (sc.hasNext()) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                proxy.add(sc.next());
            }
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                server.add(sc.next());
            }
            System.out.println(proxyServer(n, proxy, m, server));
        }

    }
}
