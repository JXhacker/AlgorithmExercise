#include<stdio.h>
#define LEN 601
#define INF 0x7FFFFFFF
int road[LEN][LEN];
int side[LEN];
int d1[LEN];
int d2[LEN];
int flag[LEN];
int N;
void Dijkstra(int *d, int n)
{
    for (int i = 1; i <= N; i++)
    {
        flag[i] = 0;
        d[i] = INF;
    }
    flag[n] = 1;
    d[n] = 0;
    int now = n;
    for (int i = 1; i < N; i++)
    {
        for (int j = 1; j <= N; j++)
        {
            if (flag[j] == 0 && road[now][j] != -1 && side[j] == side[n])
            {
                if (d[j] == INF || d[j] > d[now] + road[now][j])
                {
                    d[j] = d[now] + road[now][j];
                }
            }
        }
        int temp = INF;
        int newNow = 0;
        for (int j = 1; j <= N; j++)
        {
            if (flag[j] == 0 && d[j] != INF && d[j] < temp)
            {
                temp = d[j];
                newNow = j;
            }
        }
        if (newNow == 0) return;
        else
        {
            flag[newNow] = 1;
            now = newNow;
        }
    }
}

int main()
{
    while(scanf("%d", &N) != EOF)
    {
        if (N == 0) break;
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
            {
                road[i][j] = -1;
            }
        }
        int M;
        scanf("%d", &M);
        for (int i = 0; i < M; i++)
        {
            int c1, c2, cost;
            scanf("%d%d%d", &c1, &c2, &cost);
            if (road[c1][c2] != -1)
            {
                if (road[c1][c2] > cost)
                {
                    road[c1][c2] = cost;
                    road[c2][c1] = cost;
                }
            }
            else
            {
                road[c1][c2] = cost;
                road[c2][c1] = cost;
            }
        }
        for (int i = 1; i <= N; i++)
        {
            scanf("%d", &side[i]);
        }
        Dijkstra(d1, 1);
        Dijkstra(d2, 2);
        int ans = INF;
        for (int i = 1; i <= N; i++)
        {
            if (side[i] != side[1]) continue;
            for (int j = 1; j <= N; j++)
            {
                if (side[j] != side[2]) continue;
                if (road[i][j] != -1 && d1[i] != INF && d2[j] != INF && road[i][j] + d1[i] + d2[j] < ans) ans = road[i][j] + d1[i] + d2[j];
            }
        }
        if (ans == INF)printf("-1\n");
        else printf("%d\n", ans);
    }
    return 0;
}