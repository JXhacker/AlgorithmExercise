/// Source : https://www.nowcoder.com/practice/8e29045de1c84d349b43fdb123ab586a?tpId=40&tqId=21436&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#define N 1001
int prime[N];
void init()
{
	int i, j;
	for (i = 2; i < N; i++)
	{
		if (prime[i] == 0)
		{
			j = i + i;
			while (j < N)
			{
				prime[j] = 1;
				j = j + i; 
			}
		}
	}
}
int main()
{
	int n, a;
	while (scanf("%d%d", &n, &a) != EOF)
	{
		int i, j;
		int k = 0x7FFFFFFF;
		for (i = 2; i < N; i++)
		{
			if (prime[i] == 0 && a % i == 0)
			{
				int count = 0, count1 = 0;
				while (a % i == 0)
				{
					a = a / i;
					count++;
				}
				j = n;
				while (j)
				{
					count1 += j / i;
					j = j / i;
				}
				k = count1 / count < k ? count1 / count : k;
			}
		}
		printf("%d\n", k);
	}
	return 0;
}