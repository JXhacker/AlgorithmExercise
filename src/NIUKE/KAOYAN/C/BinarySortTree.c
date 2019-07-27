/// Source : https://www.nowcoder.com/questionTerminal/30a0153649304645935c949df7599602

#include<stdio.h>
struct Node
{
	int d;
	struct Node *lchild;
	struct Node *rchild;
}Tree[100];

struct Node * root;
int allocate = 0;
int insert(int data)
{
	struct Node * newNode = &Tree[allocate++];
	newNode->d = data;
	if (root == NULL)
	{
		root = newNode;
		return -1;
	}
	else
	{
		struct Node * temp = root;
		struct Node * pre;
		while (temp != NULL)
		{
			pre = temp;
			if (data < temp->d) temp = temp->lchild;
			else if (data > temp->d) temp = temp->rchild;
		}
		if (pre->d > data) pre->lchild = newNode;
		else pre->rchild = newNode;
		return pre->d;
	}
}

int main()
{
	int N;
	while (scanf("%d", &N) != EOF)
	{
		int i;
		root = NULL;
		allocate = 0;
		for (i = 0; i < N; i++)
		{
			Tree[i].lchild = NULL;
			Tree[i].rchild = NULL;
		}
		root = NULL;
		for (i = 0; i < N; i++)
		{
			int d;
			scanf("%d", &d);
			printf("%d\n", insert(d));
		}
	}
	return 0;
}