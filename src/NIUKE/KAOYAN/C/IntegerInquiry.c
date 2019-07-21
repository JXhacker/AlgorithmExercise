/// Source : https://www.nowcoder.com/practice/df03906024d742cc919a64c22983f5e1?tpId=40&tqId=21412&tPage=4&rp=4&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>

char ans[10000];
char input[100];

int main()
{
	int i = 0;
	int count = 0;
	memset(ans, '0', 10000);
	while (scanf("%s", input) != EOF)
	{
		int len = strlen(input);
		if (len == 1 && input[0] == '0') break;
		// 后移
		for (i = len - 1; i >= 0; i--) input[i + 100 - len] = input[i];
		for (i = 0; i < 100 - len; i++) input[i] = '0';
		// 相加
		int flag = 0;//进位
		for (i = 99; i >= 0; i--)
		{
			int temp = ans[i + 9900] - '0' + input[i] - '0' + flag;
			ans[i + 9900] = temp % 10 + '0';
			flag = temp / 10;
		}
		i = 9899;
		while (i >= 0)
		{
			int temp = ans[i] - '0' + flag;
			ans[i] = temp % 10 + '0';
			flag = temp / 10;
			i--;
		}
	}
	// 输出
	for (i = 0; i < 10000; i++)
	{
		if (ans[i] != '0')
		{
			while (i < 10000)
			{
				printf("%c", ans[i++]);
			}
		}
	}
	return 0;
}