/// Source : https://www.nowcoder.com/practice/56b5e5bb027947aa869e05711f305d3b?tpId=40&tqId=21375&tPage=3&rp=2&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include "stdio.h"
#define N 1000
int main()
{
    int n, k, pi, temp[2][N / 2], /*题中所要求的必要的变量*/
        i, j, flag, count, mark[N] /*辅助变量*/;
    char res;
    while (scanf("%d%d", &n, &k) != EOF)
    {
        i = n + 1;
        while (--i)
            mark[i] = 2; //初始化所有硬币为未确定的状态
        while (k--)
        {
            scanf("%d", &pi);
            for (i = 0; i < 2; i++)
            {
                for (j = 0; j < pi; j++)
                {
                    scanf("%d", &temp[i][j]);
                }
            }
            getchar();
            scanf("%c", &res);
            if (res == '=')
            {
                for (i = 0; i < 2; i++)
                {
                    for (j = 0; j < pi; j++)
                    {
                        mark[temp[i][j]] = 0;
                    }
                }
            }
            else
            {
                if (res == '>')
                {
                    i = pi;
                    while (i--)
                    {
                        int temp1 = temp[0][i];
                        temp[0][i] = temp[1][i];
                        temp[1][i] = temp1;
                    }
                }
                for (i = 0; i < 2; i++)
                {
                    for (j = 0; j < pi; j++)
                    {
                        if (mark[temp[i][j]] == 0)
                            continue;
                        if (mark[temp[i][j]] == 2)
                            mark[temp[i][j]] = 2 * i - 1;
                        else if (mark[temp[i][j]] != (2 * i - 1))
                            mark[temp[i][j]] = 0;
                    }
                }
                int m = n;
                while (m)
                {
                    flag = 1;
                    for (i = 2; i--;)
                    {
                        for (j = pi; j--;)
                        {
                            if (temp[i][j] == m)
                                flag = 0;
                        }
                    }
                    if (flag == 1)
                        mark[m] = 0;
                    --m;
                }
            }
        }
        i = n + 1;
        count = 0;
        while (--i)
        {
            if (!mark[i])
                count++;
            else
                flag = i;
        }
        if (count == n - 1)
            printf("%d\n", flag);
        else
            printf("0\n");
    }
}