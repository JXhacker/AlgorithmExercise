/// Source : https://www.nowcoder.com/questionTerminal/eda051c1effc4dffa630bc8507f0c5f7

#include<stdio.h>
char ans[100];

int main()
{
	int  N;
	while (scanf("%d", &N) != EOF)
	{
		int count = 0;
		if (N == 0)
		{
			printf("0\n");
			continue;
		}
		while (N != 0)
		{
			ans[count++] = (N % 8) + '0';
			N /= 8;
		}
		while(count != 0)
		{
			count--;
			printf("%c", ans[count]);
		}
		printf("\n");
	}
	return 0;
}