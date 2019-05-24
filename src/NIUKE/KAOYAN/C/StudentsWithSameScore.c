#include<stdio.h>
int main() {
    int N;
    while (scanf("%d", &N) != EOF && N != 0)
    {
        int score[101] = {0};
        int s;
        for (int i = 0; i < N; i++)
        {
            scanf("%d", &s);
            score[s]++;
        }
        int target;
        scanf("%d", &target);
        printf("%d\n", score[target]);
    }
    return 0;
}