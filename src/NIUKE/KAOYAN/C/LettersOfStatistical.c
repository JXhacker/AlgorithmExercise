#include <stdio.h>
#include<stdlib.h>
#include <string.h>
#define N 1000
int main()
{
    char str[N];
    int letter[26];
    while (gets(str))
    {
        int len = strlen(str);
        for (int i = 0; i < 26; i++)
        {
            letter[i] = 0;
        }
        for (int i = 0; i < len; i++)
        {
            if (str[i] >= 'A' && str[i] <= 'Z')
            {
                letter[str[i] - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++)
        {
            printf("%c:%d\n", i + 'A', letter[i]);
        }
        system("pause");
        return 0;
    }
}