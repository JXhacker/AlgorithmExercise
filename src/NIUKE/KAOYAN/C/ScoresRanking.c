/// Source ： https://www.nowcoder.com/questionTerminal/7a2f7d304d9e43b1bb2a6e72ed65bf51

#include<stdio.h>

struct Student
{
	char name[110];
	int age;
	int score;
}students[1000];

int cmp(const void * a, const void * b)
{
	struct Student s1 = *(struct Student *)a;
	struct Student s2 = *(struct Student *)b;
	if (s1.score != s2.score) return s1.score - s2.score;
	int temp = strcmp(s1.name, s2.name);
	if (temp != 0) return temp;
	else return s1.age - s2.age;
}

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int i;
		for (i = 0; i < N; i++)
		{
			scanf("%s%d%d", students[i].name, &students[i].age, &students[i].score);
		}
		qsort(students, N, sizeof(struct Student), cmp);
		for (i = 0; i < N; i++)
		{
			printf("%s %d %d\n", students[i].name, students[i].age, students[i].score);
		}
	}
	return 0;
}