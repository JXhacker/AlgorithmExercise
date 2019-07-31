/// Source : https://www.nowcoder.com/questionTerminal/ad11ebc8d44842c78bb0bbfb6d07ad7a

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
		int flag = 1;
		for (i = 0; i < N; i++)
		{
			for (j = i + 1; j < N; j++)
			{
				if (matrix[i][j] != matrix[j][i])
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0) break;
		}
		if (flag) printf("Yes!\n");
		else printf("No!\n");
	}
	return 0;
}