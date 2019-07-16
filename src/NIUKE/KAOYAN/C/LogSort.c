#include<stdio.h>
#include<string.h>
struct Log
{
    char raw[100];
    char name[15];
    int year, month, day, hour, minute, second, msecond;
    double time;
} logs[10000];

int compare(const void * a, const void * b)
{
    struct Log * a1 = (struct Log *) a;
    struct Log * b1 = (struct Log *) b;
    if (a1->time != b1->time) return a1->time > b1->time;
    if (a1->year != b1->year) return a1->year - b1->year;
    if (a1->month != b1->month) return a1->month - b1->month;
    if (a1->day != b1->day) return a1->day - b1->day;
    if (a1->hour != b1->hour) return a1->hour - b1->hour;
    if (a1->minute != b1->minute) return a1->minute - b1->minute;
    if (a1->second != b1->second) return a1->second - b1->second;
    return a1->msecond - b1->msecond;
}


int main()
{
    int count = 0;
    while(gets(logs[count].raw))
    {
        if (strlen(logs[count].raw) == 0) break;
        sscanf(logs[count].raw, "%s %d-%d-%d %d:%d:%d,%d %lf(s)", logs[count].name, &logs[count].year, &logs[count].month, &logs[count].day, &logs[count].hour, &logs[count].minute, &logs[count].second, &logs[count].msecond, &logs[count].time);
        count++;
    }
    qsort(logs, count, sizeof(struct Log), compare);
    for (int i = 0; i < count; i++)
    {
        printf("%s\n", logs[i].raw);
    }
    return 0;
}