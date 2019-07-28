/// Source : https://www.nowcoder.com/questionTerminal/508f66c6c93d4191ab25151066cb50ef

#include<stdio.h>
int d[100];
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
		qsort(d, n, sizeof(int), cmp);
		for (i = 0; i < n; i++)
		{
			printf("%d ", d[i]);
		}
		printf("\n");
	}
	return 0;
}