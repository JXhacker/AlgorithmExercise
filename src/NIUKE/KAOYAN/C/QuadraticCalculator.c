/// Source : https://www.nowcoder.com/practice/071f1acaada4477f94193f8c0b9054f4?tpId=40&tqId=21423&tPage=5&rp=5&ru=%2Fta%2Fkaoyan&qru=%2Fta%2Fkaoyan%2Fquestion-ranking

#include<stdio.h>
#include<string.h>
#include<math.h>

char expr[100];

int main()
{
	while (scanf("%s", expr) != EOF)
	{
		int len = strlen(expr);
		int a = 0, b = 0, c = 0;
		int i;
		int temp = 0;
		int isleft = 1;
		int ispositive = 1;
		for (i = 0;i < len; i++)
		{
			if (expr[i] >= '0' && expr[i] <= '9') temp = temp * 10 + expr[i] - '0';
			else if (expr[i] == 'x' && i < len - 1 && expr[i + 1] == '^')
			{

				if (temp == 0) a = a + isleft * ispositive * 1;
				else 
				{
					a = a + isleft * ispositive * temp;
					temp = 0;
				}
				i = i + 2;
				ispositive = 1;
			}
			else if (expr[i] == 'x')
			{
				if (temp == 0) b = b + isleft * ispositive;
				else
				{
					b = b + isleft * ispositive * temp;
					temp = 0;
				}
				ispositive = 1;
			}
			else if (expr[i] == '-') 
			{
				c += isleft * ispositive * temp;
				ispositive = -1;
			}
			else if (expr[i] == '=') isleft = -1;
			else if (expr[i] == '+')
			{
				c += isleft * ispositive * temp;
				ispositive = 1;
			}
		}
		if (temp != 0) c = c - ispositive * isleft * temp;
		int delta = b * b + 4 * a * c;
		if (delta < 0) printf("No Solution\n");
		else
		{
			double x1 = ((double)(-1 *b) + sqrt(delta))/(2 * a);
			double x2 = ((double)(-1 *b) - sqrt(delta))/(2 * a);
			if (x1 > x2) printf("%.2lf %.2lf\n", x2, x1);
			else printf("%.2lf %.2lf\n", x1, x2);
		} 
	}
} 