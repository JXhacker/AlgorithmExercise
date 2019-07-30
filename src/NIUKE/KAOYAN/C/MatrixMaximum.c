/// Source : https://www.nowcoder.com/questionTerminal/9c550b6fe85d48bcad5a6025c6dc447d

#include<stdio.h>

int matrix[100][100];

int main()
{
	int m, n;
	while (scanf("%d%d", &m, &n) != EOF)
	{
		int i, j;
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				scanf("%d", &matrix[i][j]);
			}
		}
		for (i = 0; i < m; i++)
		{
			int max = matrix[i][0];
			int sum = 0;
			int index = 0;
			for (j = 0; j < n; j++)
			{
				sum += matrix[i][j];
				if (matrix[i][j] > max)
				{
					max = matrix[i][j];
					index = j;
				}
			}
			matrix[i][index] = sum;
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (j == 0) printf("%d", matrix[i][j]);
				else printf(" %d", matrix[i][j]);
			}
			printf("\n");
		}
	}
}