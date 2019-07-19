/// Source : https://www.nowcoder.com/practice/7c4430f6aa2a48f5a817e31d1c26773e?tpId=40&tqId=21384&tPage=3&rp=3&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char str1[15];
char str2[15];
char cmp[10];
int s[2][15];//s[0]存托盘左边，s[1]存托盘右边
int flag[15];

int main()
{
    while (scanf("%s", str1) != EOF)
    {
        int t = 0;
        for (int i = 0; i < 12; i++)
        {
            flag[i] = 2; //不确定
        }
        for (int k = 0; k < 3; k++)
        {
            if (t == 0)
                t++;
            else
                scanf("%s", str1);
            scanf("%s", str2);
            scanf("%s", cmp);
            int len = strlen(str1);

            for (int i = 0; i < len; i++)
            {
                s[0][i] = str1[i] - 'A';
                s[1][i] = str2[i] - 'A';
            }
            if (strcmp(cmp, "even") == 0)
            {
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < len; j++)
                    {
                        flag[s[i][j]] = 0; //真
                    }
                }
            }
            else
            {
                if (strcmp(cmp, "up") == 0)
                {
                    for (int i = 0; i < len; i++) //左轻右重
                    {
                        int temp = s[0][i];
                        s[0][i] = s[1][i];
                        s[1][i] = temp;
                    }
                }
                    for (int i = 0; i < 2; i++)
                    {
                        for (int j = 0; j < len; j++)
                        {
                            if (flag[s[i][j]] != 0)
                            {
                                if (flag[s[i][j]] == 2)
                                    flag[s[i][j]] = (2 * i - 1);
                                else if (flag[s[i][j]] != (2 * i - 1))
                                    flag[s[i][j]] = 0;
                            }
                        }
                    }
                    //把未在s中的设置为1
                    for (int m = 0; m < 12; m++)
                    {
                        int find = 0;
                        for (int i = 0; i < 2; i++)
                        {
                            for (int j = 0; j < len; j++)
                            {
                                if (s[i][j] == m) find = 1;
                            }
                        }
                        if (find == 0) flag[m] = 0;
                    }

            }
            int a = 0;
        }
        int ans = 0;
        int target = -1;
        for (int i = 0; i < 12; i++)
        {
            if (flag[i] == 0) ans++;
            else target = i;
        }
        if (ans == 11)
        {
            if (flag[target] == -1) printf("%c is the counterfeit coin and it is light.\n", target + 'A');
            else if (flag[target] == 1) printf("%c is the counterfeit coin and it is heavy.\n", target + 'A');
            else printf("%c is the counterfeit coin.\n", target + 'A');//知道错误但无法判断轻重
        } else
        {
            printf("-1\n");
        }
    }
    return 0;
}