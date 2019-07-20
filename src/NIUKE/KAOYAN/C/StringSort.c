/// Source : https://www.nowcoder.com/practice/d9aa3894d3aa4887843a85d26daa4437?tpId=40&tqId=21407&tPage=4&rp=4&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>

char s1[1000];
char s2[1000];

int cmp(void const * a, void const * b)
{
	char a1 = (*(char *)a);
	char b1 = (*(char *)b);
	int c1, c2;
	if (a1 >= 'A' && a1 <= 'Z') c1 = a1 - 'A';
	else c1 = a1 - 'a';
	if (b1 >= 'A' && b1 <= 'Z') c2 = b1 - 'A';
	else c2 = b1 - 'a';
	return c1 - c2 > 0 ? 1 : -1; 
}

int main()
{
	while (gets(s1))
	{
		int len = strlen(s1);
		int len2 = 0;
		int i;
		for (i = 0; i < len; i++)
		{
			if ((s1[i] >= 'A' && s1[i] <= 'Z') || (s1[i] >= 'a' && s1[i] <= 'z'))
			{
				s2[len2++] = s1[i];
			} 
		}
		qsort(s2, len2, sizeof(char), cmp);
		int count = 0;
		for (i = 0; i < len; i++)
		{
			if ((s1[i] >= 'A' && s1[i] <= 'Z') || (s1[i] >= 'a' && s1[i] <= 'z'))
			{
				s1[i] = s2[count++];
			} 
		}
		printf("%s\n", s1);
	}
}