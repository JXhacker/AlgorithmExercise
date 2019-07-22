/// Source : https://www.nowcoder.com/practice/fdd6698014c340178a8b1f28ea5fadf8?tpId=40&tqId=21420&tPage=5&rp=1&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>

struct Ant
{
	int pos;
	int sta;
}ant[100];

int cmp(const void * a, const void * b)
{
	return (*(struct Ant *) a).pos - (*(struct Ant *) b).pos;
}

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int i;
		for (i = 0; i < N; i++)
		{
			scanf("%d%d", &ant[i].pos, &ant[i].sta);
		}
		qsort(ant, N, sizeof(struct Ant), cmp);
		int left = 0;
		int right = 0;
		int position = -1;
		int flag = 0;
		for (i = 0; i < N; i++)
		{
			if (ant[i].sta == 0) 
			{
				position = i;
				flag = 1;
			}
			if (flag == 0 && ant[i].sta == 1) left++;
			if (flag == 1 && ant[i].sta == -1) right++;
		}
		if (left == right) printf("Cannot fall!\n");
		else if (left > right)
		{
			int count = 0;
			for (i = position; i >= 0; i--)
			{
				if (ant[i].sta == 1) count++;
				if (count == right + 1)
				{
					printf("%d\n", 100 - ant[i].pos);
					break;
				}
			}
		}
		else
		{
			int count = 0;
			for (i = position; i < N; i++)
			{
				if (ant[i].sta == -1) count++;
				if (count == left + 1)
				{
					printf("%d\n", ant[i].pos);
					break;
				}
			}
		}
	}
	return 0;
}

