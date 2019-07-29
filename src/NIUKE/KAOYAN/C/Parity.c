/// Source : https://www.nowcoder.com/questionTerminal/729d11d043d8448e83befa1410b694fe

#include<stdio.h>
#include<string.h>

char str[101];
char bin[10];
int main()
{
	while (gets(str))
	{
		int len = strlen(str);
		int i, j;
		for (i = 0; i < len; i++)
		{
			memset(bin, '0', 10);
			int temp = str[i];
			int count = 0;
			while (temp != 0)
			{
				bin[count++] = (temp & 1) + '0';
				temp = temp >> 1;
			}
			int count2 = 0;
			for (j = 0; j < count; j++)
			{
				if (bin[j] == '1') count2++;
			}
			if (count2 % 2 == 0) bin[7] = '1';
			else bin[7] = '0';
			for (j = 7; j >= 0; j--) printf("%c", bin[j]);
			printf("\n");
		}
	}
}