/// Source : https://www.nowcoder.com/questionTerminal/99e403f8342b4d0e82f1c1395ba62d7b

#include<stdio.h>

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int s = N * N;
		if (N >= 10)
		{
			if ((s % 100) == N) printf("Yes!\n");
			else printf("No!\n");
		}
		else
		{
			if ((s % 10) == N) printf("Yes!\n");
			else printf("No!\n");
		}
	}
	return 0;
}