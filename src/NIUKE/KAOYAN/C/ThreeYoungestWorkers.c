/// Source : https://www.nowcoder.com/questionTerminal/a9fa482eb05149cdbad88689e3cb5f66

#include<stdio.h>
#include<string.h>
struct Stuff
{
	int id;
	char name[15];
	int age;
}stuff[30];

int cmp(const void * a, const void * b)
{
	struct Stuff s1 = *(struct Stuff *) a;
	struct Stuff s2 = *(struct Stuff *) b;
	if (s1.age != s2.age) return s1.age - s2.age;
	if (s1.id != s2.id) return s1.id - s2.id;
	int temp = strcmp(s1.name, s2.name);
	if (temp != 0) return temp;
}

int main()
{
	int N;
	int i;
	while (scanf("%d", &N) != EOF)
	{
		for (i = 0; i < N; i++) scanf("%d%s%d", &stuff[i].id, stuff[i].name, &stuff[i].age);
		qsort(stuff, N, sizeof(struct Stuff), cmp);
		int temp = N >= 3 ? 3 : N;
		for (i = 0; i < temp; i++) printf("%d %s %d\n", stuff[i].id, stuff[i].name, stuff[i].age);	
	}
	return 0;
}