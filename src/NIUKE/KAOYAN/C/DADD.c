/// Souce : https://www.nowcoder.com/practice/ddec753f446e4ba4944e35378ba635c8?tpId=40&tqId=21410&tPage=4&rp=4&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>

char s1[1000];
char s2[1000];

int main()
{
	while (scanf("%s", s1) != EOF)
	{
		scanf("%s", s2);
		int dot1 = 0, dot2 = 0;
		int len1 = strlen(s1);
		int len2 = strlen(s2);
		while (s1[dot1++] != '.');
		while (s2[dot2++] != '.');
		if (dot1 > dot2)
		{
			int i;
			s2[len2 + dot1 - dot2] = 0;
			for (i = len2 - 1; i >= 0; i--)
			{
				s2[i + dot1 - dot2] = s2[i];
			}
			for (i = 0; i < (dot1 - dot2); i++) s2[i] = '0';
		} else if (dot2 > dot1)
		{
			int i;
			s1[len1 + dot2 - dot1] = 0;
			for (i = len1 - 1; i >= 0; i--)
			{
				s1[i + dot2 - dot1] = s1[i];
			}
			for (i = 0; i < (dot2 - dot1); i++) s1[i] = '0';
		}
		len1 = strlen(s1);
		len2 = strlen(s2);
		if (len1 > len2)
		{ 
			int i;
			for (i = len2; i < len1; i++)
			{
				s2[i] = '0';
				len2++; 
			}
		} else if (len1 < len2)
		{
			int i;
			for (i = len1; i < len2; i++)
			{
				s1[i] = '0';
				len1++;
			}			
		}
		int flag = 0;
		int i;
		for (i = len1 - 1; i >= 0; i--)
		{
			if (s1[i] == '.') continue;
			int temp =  (s1[i] - '0' + s2[i] - '0' + flag);
			s1[i] =  temp % 10 + '0';
			flag = temp / 10;
		}
		if (flag != 0)
		{
			s1[len1 + 1] = 0;
			for (i = len1 - 1; i >= 0; i++)
			{
				s1[i + 1] = s1[i];
			}
			s1[0] = flag + '0';
		}
		
		 printf("%s\n", s1);
	}
} 