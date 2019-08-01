/// Source : https://www.nowcoder.com/questionTerminal/b744af632ac4499aa485d7bb048bb0aa

#include<stdio.h>
#include<string.h>
struct BigInteger
{
	int len;
	char data[1001];
}bigInteger[100];

int cmp(const void * a, const void * b)
{
	struct BigInteger s1 = *(struct BigInteger *)a;
	struct BigInteger s2 = *(struct BigInteger *)b;
	if (s1.len != s2.len) return s1.len - s2.len;
	int i;
	for (i = 0; i < s1.len; i++) if (s1.data[i] != s2.data[i]) return s1.data[i] - s2.data[i];
	return 1;
}

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int i;
		for (i = 0; i < N; i++)
		{
			scanf("%s", bigInteger[i].data);
			bigInteger[i].len = strlen(bigInteger[i].data);
		}
		qsort(bigInteger, N, sizeof(struct BigInteger), cmp);
		for (i = 0; i < N; i++) printf("%s\n", bigInteger[i].data);
	}
	return 0;
}