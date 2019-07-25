/// Source : https://www.nowcoder.com/practice/ccb7383c76fc48d2bbc27a2a6319631c?tpId=40&tqId=21442&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>

int daystill0[3000][13][32];

int isleap(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 1;
	else return 0;
}

int daysOfMonth[2][12] = {
	31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
	31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
};

void init()
{
	int year = 1;
	int month = 1;
	int day = 1;
	int count = 0;
	int leap = isleap(year);
	while (year < 3000)
	{
		daystill0[year][month][day] = count++;
		day++;
		if (day > daysOfMonth[leap][month - 1])
		{
			day = 1;
			month++;
			if (month > 12)
			{
				month = 1;
				year++;
				leap = isleap(year);
			}
		}
	}
}

int main()
{
	init();
	int year, month, day;
	int year1, month1, day1;
	while (scanf("%4d%2d%2d", &year, &month, &day) != EOF)
	{
		scanf("%4d%2d%2d", &year1, &month1, &day1);
		int days1 = daystill0[year][month][day];
		int days2 = daystill0[year1][month1][day1];
		printf("%d\n", days1 > days2 ? days1 -days2 + 1 : days2 - days1 + 1);
	}
	return 0;
}