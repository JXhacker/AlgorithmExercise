/// Source : https://www.nowcoder.com/questionTerminal/0fe4d131737d4138912c3b5df8569245

#include<stdio.h>

int matrix[100][100];

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int i, j;
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			{
				scanf("%d", &matrix[i][j]);
			}
		}
		for (i = 0; i < N; i++)
		{
			for (j = i + 1; j < N; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			{
				printf("%d ", matrix[i][j]);
			}
			printf("\n");
		}
	}
}