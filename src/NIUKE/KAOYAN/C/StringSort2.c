/// Source : https://www.nowcoder.com/practice/dfeed0e0e4624814b122265e859783b2?tpId=40&tqId=21413&tPage=4&rp=4&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>

struct Str
{
    char raw[100];
    int len;
}str[100];

int cmp(const void * a, const void * b)
{
	return (*(struct Str *)a).len - (*(struct Str *)b).len;
}

int main()
{
    int n;
    while(scanf("%d", &n) != EOF)
    {
    	int i = 0;
    	getchar();
        for (i = 0; i < n; i++)
        {
            memset(str[i].raw, 0, sizeof(str[i].raw)); 
            gets(str[i].raw);
            if (strcmp(str[i].raw, "stop") == 0) break;
            str[i].len = strlen(str[i].raw);
        }
        qsort(str, i, sizeof(struct Str), cmp);
        int j;
		for (j = 0; j < i; j++)
        {
        	printf("%s\n", str[j].raw);
		}
    }
    return 0;
}