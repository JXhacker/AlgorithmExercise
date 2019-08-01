/// Source : https://www.nowcoder.com/questionTerminal/b42cfd38923c4b72bde19b795e78bcb3

#include<stdio.h>

struct Node
{
	int d;
	struct Node * lchild;
	struct Node * rchild;
}Tree[100];
int allocate = 0;

void preOrder(struct Node * root)
{
	printf("%d ", root->d);
	if (root->lchild != NULL) preOrder(root->lchild);
	if (root->rchild != NULL) preOrder(root->rchild);
}

void inOrder(struct Node * root)
{
	if (root->lchild != NULL) inOrder(root->lchild);
	printf("%d ", root->d);
	if (root->rchild != NULL) inOrder(root->rchild);
}

void postOrder(struct Node * root)
{
	if (root->lchild != NULL) postOrder(root->lchild);
	if (root->rchild != NULL) postOrder(root->rchild);
	printf("%d ", root->d);
}

struct Node * insert(struct Node * root, int d)
{

	if (root == NULL)
	{
		struct Node * newNode = &Tree[allocate++];
		newNode->d = d;
		newNode->lchild = NULL;
		newNode->rchild = NULL;
		return newNode;
	}
	if (root->d > d) root->lchild = insert(root->lchild, d);
	else if (root->d < d) root->rchild = insert(root->rchild, d);
	return root;
}

int main()
{
	int n;
	while (scanf("%d", &n) != EOF)
	{
		int i;
		allocate = 0;
		struct Node * root = NULL;
		for (i = 0; i < n; i++)
		{
			int temp;
			scanf("%d", &temp);
			root = insert(root, temp);
		}
		preOrder(root);
		printf("\n");
		inOrder(root);
		printf("\n");
		postOrder(root);
		printf("\n");
	}
	return 0;
}