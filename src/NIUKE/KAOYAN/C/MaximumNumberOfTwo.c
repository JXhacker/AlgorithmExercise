/// Source : https://www.nowcoder.com/questionTerminal/7385949943264a9fa4348cbd43e6e00c

#include<stdio.h>

int matrix[4][5];
int ans[2][5];

int main()
{
	while (scanf("%d", &matrix[0][0]) != EOF)
	{
		int i, j;
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (i == 0 && j == 0) continue;
				scanf("%d", &matrix[i][j]);
			}
		}
		for (i = 0; i < 5; i++)
		{
			int a1 = 0, a2 = 1;
			for (j = 2; j < 4; j++)
			{
				if (matrix[a1][i] >= matrix[a2][i])
				{
					if (matrix[j][i] > matrix[a2][i]) a2 = j;
				}
				else
				{
					if (matrix[j][i] > matrix[a1][i]) 
					{
						a1 = a2;
						a2 = j;
					}
				}
			}
			ans[0][i] = a1;
			ans[1][i] = a2;
		}
		for (i = 0; i < 2; i++)
		{
			for (j = 0; j < 5; j++)
			{
				printf("%d ", matrix[ans[i][j]][j]);
			}
			printf("\n");
		}
	}
	return 0;
}