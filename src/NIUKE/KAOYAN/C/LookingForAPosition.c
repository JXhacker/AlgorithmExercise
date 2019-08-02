/// Source : https://www.nowcoder.com/questionTerminal/e3b2cc44aa9b4851bdca89dd79c53150

#include<stdio.h>
#include<string.h>
char str[101];

int main()
{
	while (scanf("%s", str) != EOF)
	{
		int i, j;
		int len = strlen(str);
		for (i = 0; i < len; i++)
		{
			if (str[i] == '*') continue;
			int flag = 0;
			for (j = i + 1; j < len; j++)
			{
				if (str[j] == str[i])
				{
					if (flag == 0)
					{
						flag = 1;
						printf("%c:%d", str[i], i);
					}
					printf(",%c:%d", str[j], j);
					str[j] = '*';
				}
			}
			str[i] = '*';
			if (flag == 1) printf("\n");
		}
	}
	return 0;
}