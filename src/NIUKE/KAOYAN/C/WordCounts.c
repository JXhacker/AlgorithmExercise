/// Source : https://www.nowcoder.com/questionTerminal/11c6e7c9987c4ab48f8cdd8834c27064

#include<stdio.h>
#include<string.h>

char word[1000];

int main()
{
	while (gets(word))
	{
		int i;
		int len = strlen(word);
		for (i = 0; i < len; i++)
		{
			if (word[i] == '.') break;
			if (word[i] != ' ')
			{
				int ans = 0;
				while(word[i] != ' ' && word[i] != '.') 
				{
					ans++;
					i++;
				}
				printf("%d ", ans);
			}
		}
	}
}