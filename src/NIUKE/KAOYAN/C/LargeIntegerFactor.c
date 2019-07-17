#include<stdio.h>
#include<string.h>

char str[30];
int d[30];

int main()
{
    while(scanf("%s", str) != EOF)
    {
        int len = strlen(str);
        for (int i = 0; i < len; i++) d[i] = str[i] - '0';
        int count = 0;
        for (int i = 2; i <= 9; i++)
        {
            int temp = 0;
            for (int j = 0; j < len; j++)
            {
                temp = (temp * 10 + d[j]) % i;
            }
            if (temp == 0)
            {
                count++;
                if (count == 1) printf("%d", i);
                else printf(" %d", i);
            }
        }
        if (count == 0) printf("none");
        printf("\n");
    }
    return 0;
}