/// Source : https://www.nowcoder.com/questionTerminal/4c39c984ea3848b48e111b8e71ec1dd4

#include<stdio.h>
#include<string.h>

char d1[1001];
char d2[1001];
char d3[1001];

int main()
{
	while (scanf("%s%s", d1, d2) != EOF)
	{
		int len1 = strlen(d1);
		int len2 = strlen(d2);
		if (len1 > len2)
		{
			int len = len1;
			len1 = len2;
			len2 = len;
			strcpy(d3, d1);
			strcpy(d1, d2);
			strcpy(d2, d3);
		}
		int i;
		for (i = len1 - 1; i >= 0; i--) d1[i + len2 - len1] = d1[i];
		for (i = 0; i < len2 - len1; i++) d1[i] = '0';
		int flag = 0;
		for (i = len2 - 1; i >= 0; i--)
		{
			int temp = d1[i] - '0' + d2[i] - '0' + flag;
			d2[i] = ((temp) % 10 ) + '0';
			flag = temp / 10;
		}
		if (flag != 0)
		{
			for (i = len2 - 1; i >= 0; i--)
			{
				d2[i + 1] = d2[i];
			}
			d2[0] = flag + '0';
		}
		printf("%s\n", d2);
	}
}