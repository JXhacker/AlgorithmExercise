/// Source : https://www.nowcoder.com/practice/7cf7b0706d7e4b439481f53e5fdac6e7?tpId=40&tqId=21434&tPage=6&rp=6&ru=/ta/kaoyan&qru=/ta/kaoyan/question-ranking

#include<stdio.h>

int getBit(n, i)
{
	return (n >> i) & 1;
}

void print(int n)
{
	int i;
	int first = 0;
	for (i = 15; i >= 0; i--)
	{
		int bi = getBit(n, i);
		if (bi == 0) continue;
		else
		{
			if (first == 0)first = 1;
			else printf("+"); 
			if (i == 1)printf("2");
			else
			{
				printf("2(");
				if (i == 0) printf("0");
				else print(i);
				printf(")");
			}
		}
	}
}

int main()
{
	int n;
	while (scanf("%d", &n) != EOF) 
	{
		print(n);
		printf("\n");
	}
}