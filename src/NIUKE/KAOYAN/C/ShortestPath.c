/// Source : https://www.nowcoder.com/practice/a29d0b5eb46b4b90bfa22aa98cf5ff17?tpId=40&tqId=21438&tPage=6&rp=5&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>

int path[100][100];
int Tree[100]; 

int findRoot(int n)
{
	if (Tree[n] == -1) return n;
	int temp = findRoot(Tree[n]);
	Tree[n] = temp;
	return temp;
}

int main()
{
	int N, M;
	while (scanf("%d%d", &N, &M) != EOF)
	{
		int i, j, k, dis, x, y, xRoot, yRoot;
		// init 
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			{
				path[i][j] = -1;
			}
			path[i][i] = 0;
			Tree[i] = -1;
		}
		dis = 1;
		for (i = 0; i < M; i++)
		{
			scanf("%d%d", &x, &y);
			xRoot = findRoot(x);
			yRoot = findRoot(y);
			if (xRoot != yRoot)
			{
				for (j = 0; j < N; j++)
				{
					if (xRoot == findRoot(j))
					{
						for (k = 0; k < N; k++)
						{
							if (yRoot == findRoot(k))
							{
								path[j][k] = path[k][j] = (path[j][x] + path[y][k] + dis) % 100000; 
							}
						}
					}
				}
				Tree[xRoot] = yRoot;
			}
			dis = (dis * 2) % 100000;
		}
		for (i = 1; i < N; i++)
		{
			printf("%d\n", path[0][i]);
		}
	}
	return 0;
}