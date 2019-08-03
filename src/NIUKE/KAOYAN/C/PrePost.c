/// Source : https://www.nowcoder.com/questionTerminal/89844f1f632c475ab6f4a600f71683a8

#include<stdio.h>
#include<string.h> 

char str1[30];
char str2[30];
int m;

int combination(int m, int count)
{
	if (count > m / 2) return combination(m, m - count);
	int i;
	int a1 = 1;
	int a2 = 1;
	int temp = count;
	for (i = 0; i < temp; i++)
	{
		a1 *= count--;
		a2 *= m--;
	}
	return a2 / a1;
}

long long build(int s1, int e1, int s2, int e2)
{
	int i;
	if (s1 == e1) return 1;
	int temp = s2;
	int countsubs = 0;
	long long ans = 1;
	int start1 = s1 + 1;
	int start2 = s2;
	while (temp < e2)
	{
		if (str2[temp] == str1[start1])
		{
			ans *= build(start1, temp + start1 - start2, start2, temp);
			start1 = temp + start1 - start2 + 1;
			start2 = temp + 1;
			countsubs++;
		}
		temp++;
	}
	int ans2 = combination(m, countsubs);
	ans *= (long long) ans2;
	return ans;
}

int main()
{
	while (scanf("%d", &m) != EOF)
	{
		if (m == 0) break;
		scanf("%s%s", str1, str2);
		int len = strlen(str1);
		long long ans = build(0, len - 1, 0, len - 1);
		printf("%lld\n", ans);
	}
	return 0;
}