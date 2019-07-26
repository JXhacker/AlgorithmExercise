/// Source : https://www.nowcoder.com/questionTerminal/2359e23180194f99828f5cd9c764236a

#include<stdio.h>
#include<string.h>

char ip[100];

int main()
{
	while (scanf("%s", ip) != EOF)
	{
		int len = strlen(ip);
		int i;
		int flag = 1;
		for (i = 0; i < len; i++)
		{
			int temp = 0;
			while (i < len && ip[i] != '.')
			{
				temp = temp * 10 + ip[i] - '0';
				i++;
			}
			if (temp > 255 || temp < 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1) printf("Yes!\n");
		else printf("No!\n"); 
	}
	return 0;
}