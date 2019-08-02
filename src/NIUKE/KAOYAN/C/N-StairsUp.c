/// Source : https://www.nowcoder.com/questionTerminal/c978e3375b404d598f1808e4f89ac551

#include<stdio.h>

int ans[100];

void init()
{
	int i;
	ans[1] = 1;
	ans[2] = 2;
	for (i = 3; i < 90; i++) ans[i] = ans[i - 1] + ans[i - 2];
}

int main()
{
	init();
	int N;
	while (scanf("%d", &N) != EOF) printf("%d\n", ans[N]);
	return 0;
}