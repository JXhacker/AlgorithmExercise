#include <stdio.h>
#define LEN 10000

int tree[LEN];
int mark[LEN];

int main()
{
    int n1, n2;
    int caseCount = 0;
    while (scanf("%d%d", &n1, &n2) != EOF)
    {
        if (n1 == -1 && n2 == -1)
            break;
        caseCount++;
        for (int i = 1; i < LEN; i++)
        {
            tree[i] = -1;
            mark[i] = -1;
        }
        int flag = 1;
        if (n1 == 0 && n2 == 0)
        {
            printf("Case %d is a tree.\n", caseCount);
        }
        else
        {
            while (n1 != 0 && n2 != 0)
            {
                if (tree[n2] == -1)
                {
                    tree[n2] = n1;
                    mark[n1] = 1;
                    mark[n2] = 1;
                }
                else
                {
                    flag = 0;
                }
                scanf("%d%d", &n1, &n2);
            }

            if (flag == 1)
            {
                int count = 0;
                for (int i = 1; i < LEN; i++)
                {
                    if (mark[i] == 1 && tree[i] == -1)
                        count++;
                }
                if (count != 1)
                    flag = 0;
            }
            if (flag == 1)
                printf("Case %d is a tree.\n", caseCount);
            else
                printf("Case %d is not a tree.\n", caseCount);
        }
    }
    return 0;
}