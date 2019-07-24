/// Source : https://www.nowcoder.com/practice/8ef506fbab2742809564e1a288358554?tpId=40&tqId=21437&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#define MAX_INT 123456789

int matrix[101][101];
int temp[101];
int N, M, K;

int shortest()
{
	int s = 0, e = 0, sum = temp[0], ans = MAX_INT;
	while (e < M && s < M && e >= s)
	{
		if (sum < K)
		{
			e++;
			if (e < M) sum += temp[e];
		}
		else
		{
			if (e - s + 1 < ans) ans = e - s + 1;
			sum -= temp[s];
			s++; 
		}
	}
	return ans;
}

int main()
{
	while (scanf("%d%d%d", &N, &M, &K) != EOF)
	{
		int i, j, k;
		int ans = MAX_INT;
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < M; j++)
			{
				scanf("%d", &matrix[i][j]);
			}
		}
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < M; j++) temp[j] = 0;
			for (j = i; j < N; j++)
			{
				for (k = 0; k < M; k++) temp[k] += matrix[j][k];
				int len = shortest();	
				if (len != MAX_INT)
				{
					if (len * (j - i + 1) < ans) ans = len * (j - i + 1);
				}
			}
		}
		if (ans == MAX_INT) printf("-1\n");
		else printf("%d\n", ans);
	}
	return 0;
}