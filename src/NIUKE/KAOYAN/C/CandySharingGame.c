#include<stdio.h>

int candy[101];
int share[101];
int count;
int N;

int done()
{
    for (int k = 1; k < N; k++)
    {
        if (candy[k] != candy[0]) return 0;
    }
    return 1;
}

void whistle()
{
    for (int i = 0; i < N; i++) share[i] = candy[i] / 2;
    for (int i = 1; i < N; i++)
    {
        candy[i] = candy[i] + share[i - 1] - share[i];
        if (candy[i] % 2 == 1) candy[i]++;
    }
    candy[0] = candy[0] + share[N - 1] - share[0];
    if (candy[0] % 2 != 0) candy[0]++;
    count++;
}

int main()
{
    while (scanf("%d", &N) != EOF)
    {
        if (N == 0)
        {
            printf("0 0\n");
            continue;
        }
        for (int i = 0; i < N; i++)
        {
            scanf("%d", &candy[i]);
        }
        count = 0;
        int temp = done();
        while (temp != 1)
        {
            whistle();
            temp = done();
        }
        printf("%d %d\n", count, candy[0]);
    }

}