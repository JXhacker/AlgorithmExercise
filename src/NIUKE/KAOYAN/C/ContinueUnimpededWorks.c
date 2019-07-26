/// Source : https://www.nowcoder.com/questionTerminal/16212f7d46e44174b5505997ea998538

#include<stdio.h>

int Tree[100];

struct V
{
	int v1;
	int v2;
	int cost;
}v[5000];

int cmp(const void * a, const void * b)
{
	return (*(struct V *)a).cost - (*(struct V *)b).cost;
}

int findRoot(int a)
{
	if (Tree[a] == -1) return a;
	int temp = findRoot(Tree[a]);
	Tree[a] = temp;
	return temp;
}

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		if (N == 0) break;
		int i;
		for (i = 1; i <= N; i++) Tree[i] = -1;
		int count = 0;
		for (i = 0; i < N * (N - 1) / 2; i++)
		{
			int v1, v2, cost, isbuild;
			scanf("%d%d%d%d", &v1, &v2, &cost, &isbuild);
			if (isbuild == 0)
			{
				v[count].v1 = v1;
				v[count].v2 = v2;
				v[count].cost = cost;
				count++;
			}
			else
			{
				int root1 = findRoot(v1);
				int root2 = findRoot(v2);
				if (root1 != root2) Tree[root1] = root2;
			}
		}
		qsort(v, count, sizeof(struct V), cmp);
		int ans = 0;
		for (i = 0; i < count; i++)
		{
			int root1 = findRoot(v[i].v1);
			int root2 = findRoot(v[i].v2);
			if (root1 != root2)
			{
				ans += v[i].cost;
				Tree[root1] = root2;
			}
		}
		printf("%d\n", ans);
	}
	return 0;
}