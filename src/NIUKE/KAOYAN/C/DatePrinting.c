/// Source : https://www.nowcoder.com/questionTerminal/b1f7a77416194fd3abd63737cdfcf82b

#include<stdio.h>

int daysOfMonth[2][12] = {
	31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
	31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
};

int isleap(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 1;
	else return 0;
}

int main()
{
	int y, n;
	while (scanf("%d%d", &y, &n) != EOF)
	{
		int leap = isleap(y);
		int month = 0;
		int day;
		while(n > daysOfMonth[leap][month])
		{
			n -= daysOfMonth[leap][month];
			month++;
		}
		day = n;
		month++;
		printf("%d-%02d-%02d\n", y, month, day);
	}
	return 0;
}