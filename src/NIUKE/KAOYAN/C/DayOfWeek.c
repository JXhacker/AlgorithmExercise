/// Souce : https://www.nowcoder.com/practice/a3417270d1c0421587a60b93cdacbca0?tpId=40&tqId=21439&tPage=6&rp=6&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>

int daystill1000[3001][13][32];

int dayOfMonth[2][12] = {
	31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
	31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};

char monthNames[12][15] = {
	"January",
	"February",
	"March",
	"April",
	"May",
	"June",
	"July",
	"August",
	"September",
	"October",
	"November",
	"December"
};

char weekNames[7][15] = {
	"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday",
	"Saturday",
	"Sunday"
};

int isleap(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 1;
	else return 0;
}

void init()
{
	int year = 1000;
	int month = 1;
	int day = 1;
	int count = 0;
	int leap = isleap(year);
	while (year <= 3000)
	{
		daystill1000[year][month][day] = count++;
		day++;
		if (dayOfMonth[leap][month - 1] < day)
		{
			day = 1;
			month++;
			if (month > 12)
			{
				year++;
				leap = isleap(year);
				month = 1;
			}
		}
	}	
}


int main()
{
	init();
	int day, year, month = -1;
	char monthName[15];
	while (scanf("%d%s%d", &day, monthName, &year) != EOF)
	{
		int i;
		for (i = 0; i < 12; i++)
		{
			if (strcmp(monthNames[i], monthName) == 0) 
			{
				month = i + 1;
				break;
			}
		}
		if (month == -1)
		{
			printf("month input error\n");
			continue;
		}
		int daystills = daystill1000[year][month][day];
		int todaytills = daystill1000[2019][7][24];
		int week1 = 2;
		int week = (week1 + ((((daystills - todaytills) % 7) + 7) % 7 )) % 7;
		printf("%s\n", weekNames[week]);
	}
	return 0;
}