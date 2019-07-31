/// Source : https://www.nowcoder.com/questionTerminal/b183eac8dfba4de99d47c1ca4ce9571f

#include<stdio.h>
#include<string.h>

char str1[30], str2[30];

int main()
{
	while (scanf("%s%s", str1, str2) != EOF)
	{
		int len1 = strlen(str1);
		int len2 = strlen(str2);
		int num1 = 0, num2 = 0;
		int i;
		int flag = 0;
		for (i = 0; i < len1; i++)
		{
			if (str1[i] == ',') continue;
			if (str1[i] == '-') flag = 1;
			else
			{
				num1 = num1 * 10 + str1[i] - '0';
			}
		}
		num1 = flag == 1 ? -num1 : num1;
		flag = 0;
		for (i = 0; i < len2; i++)
		{
			if (str2[i] == ',') continue;
			if (str2[i] == '-') flag = 1;
			else
			{
				num2 = num2 * 10 + str2[i] - '0';
			}
		}
		num2 = flag == 1 ? -num2 : num2;
		printf("%d\n", num1 + num2);
	}
	return 0;
}