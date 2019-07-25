/// Source : https://www.nowcoder.com/practice/c54775799f634c72b447ef31eb36e975?tpId=40&tqId=21440&tPage=6&rp=6&ru=/ta/kaoyan&qru=/ta/kaoyan/question-ranking

#include<stdio.h>

long long int d[1000];

int main()
{
	int N;
	int i;
	while (scanf("%d", &N) != EOF)
	{
		for (i = 0; i < N; i++)
		{
			scanf("%lld", &d[i]);
		}
		for (i = N - 1; i >= 0; i--)
		{
			printf("%lld ", d[i]);
		}
		printf("\n");
	}
	return 0;
}