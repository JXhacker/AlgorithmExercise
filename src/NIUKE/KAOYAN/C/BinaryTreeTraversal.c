/// Source : https://www.nowcoder.com/questionTerminal/6e732a9632bc4d12b442469aed7fe9ce

#include<stdio.h>
#include<string.h>
char str1[30];
char str2[30];

struct Node
{
	char c;
	struct Node * lchild;
	struct Node * rchild;
} Tree[30];
int allocate;

void postOrder(struct Node * root)
{
	if (root->lchild != NULL) postOrder(root->lchild);
	if (root->rchild != NULL) postOrder(root->rchild);
	printf("%c", root->c);
}

struct Node * build(int s1, int e1, int s2, int e2)
{
	struct Node * root = &Tree[allocate++];
	root->c = str1[s1];
	int i;
	int mid = -1;
	for (i = s2; i <= e2; i++)
	{
		if (str2[i] == str1[s1])
		{
			mid = i;
			break;
		}
	}
	if (mid != s2) root->lchild = build(s1 + 1, s1 + mid - s2, s2, mid - 1);
	if (mid != e2) root->rchild = build(e1 - e2 + mid + 1, e1, mid + 1, e2);
	return root;
}

int main()
{
	while (scanf("%s%s", str1, str2) != EOF)
	{
		int i;
		int len = strlen(str1);
		if (len == 0) continue;
		for (i = 0; i < 30; i++)
		{
			Tree[i].lchild = NULL;
			Tree[i].rchild = NULL;
		}
		allocate = 0;
		struct Node * root = build(0, len -1, 0, len - 1);
		postOrder(root);
		printf("\n");
	}
	return 0;
}