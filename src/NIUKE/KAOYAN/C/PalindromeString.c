/// Source : https://www.nowcoder.com/questionTerminal/df00c27320b24278b9c25f6bb1e2f3b8

#include<stdio.h>
#include<string.h>
char str[1000];

int main()
{
	while (scanf("%s", str) != EOF)
	{
		int len = strlen(str);
		int l = 0, r = len - 1;
		while (l < r)
		{
			if (str[l] != str[r]) break;
			l++;
			r--;
		}
		if (l < r) printf("No!\n");
		else printf("Yes!\n");
	}
}