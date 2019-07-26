/// Source : https://www.nowcoder.com/questionTerminal/0ba5d8f525494a8787aaa9d53b5f9b9e

#include<stdio.h>

int tree[1000];

int main()
{
	int N, M;
	while (scanf("%d", &N) != EOF)
	{
		if (N == 0) break;
		else scanf("%d", &M);
		
		int i;
		for (i = 1; i <= N; i++) tree[i] = 0;
		for (i = 0; i < M; i++)
		{
			int p1, p2;
			scanf ("%d%d", &p1, &p2);
			tree[p1]++;
			tree[p2]++;	
		}
		int flag = 1;
		for (i = 1; i <= N; i++)
		{
			if (tree[i] % 2 != 0)
			{
				flag = 0;
				break;
			}
		}
		printf("%d\n", flag);
	}
	return 0;
}