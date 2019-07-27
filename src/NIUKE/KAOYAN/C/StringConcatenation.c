/// Source : https://www.nowcoder.com/questionTerminal/40d83e5509b04d20825ae68fe35e9ca8

#include<stdio.h>
char s1[200];
char s2[100];
int main()
{
	while (scanf("%s%s", s1, s2) != EOF)
	{
		int i = 0, j = 0;
		while (s1[i] != 0) i++;
		while (s2[j] != 0) s1[i++] = s2[j++];
		s1[i] = 0;
		printf("%s\n", s1);
	}
}