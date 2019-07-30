/// Source : https://www.nowcoder.com/questionTerminal/7d348aa8b7d24e01a4f10bd023e2fb54

#include<stdio.h>

struct Node
{
	int d;
	struct Node * next;
}links[1000];

int allocate = 0;

int main()
{
	int n;
	while (scanf("%d", &n) != EOF)
	{
		allocate = 0;
		struct Node * head = NULL;
		int d;
		int i;
		for (i = 0; i < n; i++)
		{
			scanf("%d", &d);
			struct Node * newNode = &links[allocate++];
			newNode->next = NULL;
			newNode->d = d;
			if (head == NULL)
			{
				head = &links[allocate++];
				head->next = newNode;
			}
			else
			{
				struct Node * pre = head;
				struct Node * now = head->next;
				while (now != NULL)
				{
					if (d < now->d)
					{
						newNode->next = now;
						pre->next = newNode;
						break;
					}
					else
					{
						pre = pre->next;
						now = now->next;
					}
				}
				if (now == NULL)
				{
					pre->next = newNode;
				}
			}
		}
		struct Node * temp = head;
		while (head != NULL && head->next != NULL)
		{
			printf("%d ", head->next->d);
			head = head->next;
		}
		printf("\n");
	}
	return 0;
}