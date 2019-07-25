/// Source : https://www.nowcoder.com/practice/c5f8688cea8a4a9a88edbd67d1358415?tpId=40&tqId=21441&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>

int mark[100001];
int prime[10000];
int count = 0;

void init()
{
	int i;
	for (i = 2; i < 100001; i++)
	{
		if (mark[i] == 0)
		{
			prime[++count] = i;
			int j = i + i;
			while (j < 100001)
			{
				mark[j] = 1;
				j += i;
			}
		}
	}
}

int main()
{
	init();
	int k;
	while (scanf("%d", &k) != EOF)
	{
		printf("%d\n", prime[k]);
	}
}