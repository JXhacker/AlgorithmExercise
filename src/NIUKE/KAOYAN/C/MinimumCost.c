#include<stdio.h>
#define INF 0x7FFFFFFF


int dist[101];
int dp[101];
int l1, l2, l3, c1, c2, c3;

int getCost(int dis)
{
    if (dis > 0 && dis <= l1) return c1;
    else if (dis <= l2) return c2;
    else return c3;
}

int main()
{
    while(scanf("%d%d%d%d%d%d", &l1, &l2, &l3, &c1, &c2, &c3) != EOF)
    {
        int from, to;
        scanf("%d%d", &from, &to);
        int n;
        scanf("%d", &n);
        for (int i = 2; i <= n ; i++){
            scanf("%d", &dist[i]);
        }
        dp[from] = 0;
        for(int i = from + 1; i <= to; i++)
        {
            dp[i] = INF;
            for (int j = from; j < i; j++)
            {
                if (dist[i] - dist[j] <= l3 && dp[i] > dp[j] + getCost(dist[i] - dist[j])) dp[i] = dp[j] + getCost(dist[i] - dist[j]);
            }
            if (dp[i] == INF) return -1;
        }
        printf("%d\n", dp[to]);
    }
}