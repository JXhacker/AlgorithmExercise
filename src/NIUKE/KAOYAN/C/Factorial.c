/// Source : https://www.nowcoder.com/questionTerminal/e58c8a55162d49c48115bdfa5da7da56

#include<stdio.h>
int main()
{
	int n;
	while (scanf("%d", &n) != EOF)
	{
		int i;
		int y1 = 0;
		int y2 = 0;
		int temp = 1;
		for (i = 1; i <= n; i++)
		{
			temp *= i;
			if (i % 2 == 0) y2 += temp;
			else y1 += temp; 
		}
		printf("%d %d\n", y1, y2);
	}
	return 0;
}