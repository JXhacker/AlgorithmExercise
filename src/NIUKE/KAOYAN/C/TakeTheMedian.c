/// Source : https://www.nowcoder.com/practice/d69e75bb224e4a7785a02b2acc0821c4?tpId=40&tqId=21443&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
int l1[1000000];
int l2[1000000];
int l3[1000000];

int main()
{
	int len1, len2;
	while (scanf("%d%d", &len1, &len2) != EOF)
	{
		int i;
		for (i = 0; i < len1; i++) scanf("%d", &l1[i]);
		for (i = 0; i < len2; i++) scanf("%d", &l2[i]);
		int count = 0;
		int start, end;
		scanf ("%d%d", &start, &end);
		for (i = start - 1; i < end; i++) l3[count++] = l1[i];
		scanf ("%d%d", &start, &end);
		for (i = start - 1; i < end; i++) l3[count++] = l2[i];
		if (count % 2 == 0) printf("%d\n", l3[count / 2 - 1]);
		else printf("%d\n", l3[count / 2]);
	}
}