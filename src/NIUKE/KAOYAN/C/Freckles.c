/// Source : https://www.nowcoder.com/practice/41b14b4cd0e5448fb071743e504063cf?tpId=40&tqId=21371&tPage=2&rp=2&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<math.h>

int Tree[101];

int getRoot(int n)
{
    if (Tree[n] == -1) return n;
    int temp = getRoot(Tree[n]);
    Tree[n] = temp;
    return temp;
}

struct Node
{
    double x;
    double y;
}nodes[101];

struct Edge
{
    int from;
    int to;
    double cost;
}edges[6000];

double getDistance(struct Node n1, struct Node n2)
{
    return sqrt((n1.x - n2.x) * (n1.x - n2.x) + (n1.y - n2.y) * (n1.y - n2.y));
}

int compare(const void * n1, const void * n2)
{
    return ((*(struct Edge *)n1).cost > (*(struct Edge *)n2).cost) ? 1 : -1;
}

int main()
{
    int n;
    while(scanf("%d", &n) != EOF)
    {
        for (int i = 1; i <= n; i++)
        {
            scanf("%lf%lf", &nodes[i].x, &nodes[i].y);
            Tree[i] = -1;
        }
        int count = 0;
        for (int i = 1; i < n; i++)
        {
            for (int j = i + 1; j <= n; j++)
            {
                edges[count].from = i;
                edges[count].to = j;
                edges[count].cost = getDistance(nodes[i], nodes[j]);
                count++;
            }
        }
        qsort(edges, count, sizeof(struct Edge), compare);
        double ans = 0;
        for (int i = 0; i < count; i++)
        {
            int Rootfrom = getRoot(edges[i].from);
            int Rootto = getRoot(edges[i].to);
            if (Rootfrom != Rootto)
            {
                ans += edges[i].cost;
                Tree[Rootfrom] = Rootto;
            }
        }
        printf("%.2lf\n", ans);
    }
    return 0;
}