/// Source : https://www.nowcoder.com/questionTerminal/23c9fe571c1346bb91fdffea8a0b195f

#include<stdio.h>
#include<stdlib.h>

int max(int g1, int g2, int g3)
{
	if (g1 > g2 && g1 > g3) return g1;
	else return g2 > g3 ? g2 : g3;
}

int main()
{
	int P, T, G1, G2, G3, GJ;
	while (scanf("%d%d%d%d%d%d", &P, &T, &G1, &G2, &G3, &GJ) != EOF)
	{
		double ans;
		if (abs(G1 - G2) <= T) ans = ((double)G1 + (double)G2) / 2;
		else if ((abs(G1 - G3) <= T) && (abs(G2 - G3) <= T))ans = (double) max(G1, G2, G3);
		else if (abs(G1 - G3) <= T)ans = ((double)G1 + (double)G3) / 2;
		else if (abs(G2 - G3) <= T)ans = ((double)G2 + (double)G3) / 2;
		else ans = (double) GJ;
		printf("%.1lf\n", ans); 
	}
	return 0;
}