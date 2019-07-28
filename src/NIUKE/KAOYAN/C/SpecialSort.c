/// Source : https://www.nowcoder.com/questionTerminal/57f0f528bff149be9580af66f6292430

#include<stdio.h>

int d[1000];

int cmp(const void * a, const void * b)
{
	return *(int *)a - *(int *)b;
}
int main()
{
	int n;
	while (scanf("%d", &n) != EOF)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			scanf("%d", &d[i]);
		}
		if (n == 1)
		{
			printf("%d\n", d[0]);
			printf("-1\n");
			continue;
		}
		qsort(d, n, sizeof(int), cmp);
		printf("%d\n", d[n - 1]);
		for (i = 0; i < n - 1; i++)
		{
			printf("%d ", d[i]);
		}
		printf("\n");
	}
}