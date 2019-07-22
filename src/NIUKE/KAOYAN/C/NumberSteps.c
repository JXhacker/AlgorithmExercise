/// Source : https://www.nowcoder.com/practice/e3d8d4dd9ec740f9b1e7fc1e8574ba21?tpId=40&tqId=21414&tPage=5&rp=1&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>

struct Point
{
	int x;
	int y;
	int d;
}p[10000];

int go[4][2] = {
	1, 1,
	1, -1,
	1, 1,
	-1, 1
};

void init()
{
	int i;
	int x = 0;
	int y = 0;
	for (i = 0; i <= 10000; i++)
	{
		p[i].x = x;
		p[i].y = y;
		p[i].d = i;
		int temp = i % 4;
		x += go[temp][0];
		y += go[temp][1];		
	}
}

int main()
{
	int x, y;
	int i;
	init();
	while (scanf("%d%d", &x, &y) != EOF)
	{
		int find = 0;
		for (i = 0; i < 10000; i++)
		{
			if (p[i].x == x && p[i].y == y)
			{
				find = 1;
				printf("%d\n", p[i].d);
				break;
			}
		}
		if (find == 0) printf("No Number\n");
	}
}