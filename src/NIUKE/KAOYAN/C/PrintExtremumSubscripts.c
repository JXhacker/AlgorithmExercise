/// Source : https://www.nowcoder.com/practice/7fd72f8ac7964ba3b8baa8735246e1f1?tpId=40&tqId=21385&tPage=3&rp=3&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking
#include<stdio.h>

int data[80];

int main()
{
    int k;

        scanf("%d", &k);
        int first = 0;
        for (int i = 0; i < k; i++)
        {
            scanf("%d", &data[i]);
        }
        for (int i = 0; i < k; i++)
        {
            if (i == 0 && data[i] != data[i + 1])
            {
                if (first == 0)
                {
                    printf("%d", i);
                    first++;
                } else
                {
                    printf(" %d", i);
                }
            }
            else if (i == k - 1 && data[i] != data[i - 1])
            {
                if (first == 0)
                {
                    printf("%d", i);
                    first++;
                } else
                {
                    printf(" %d", i);
                }
            }
            else
            {
                if ((data[i] > data[i - 1] && data[i] > data[i + 1]) || (data[i] < data[i - 1] && data[i] < data[i + 1]))
                {
                if (first == 0)
                {
                    printf("%d", i);
                    first++;
                } else
                {
                    printf(" %d", i);
                }
                }
            }
        }
        printf("\n");
    return 0;
}