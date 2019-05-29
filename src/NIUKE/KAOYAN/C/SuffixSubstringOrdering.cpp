#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    string s;
    while (cin >> s)
    {
        vector<string> ss;
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            ss.push_back(string(s, i, length - i));
        }
        sort(ss.begin(), ss.end());
        for (int i = 0; i < ss.size(); i++)
        {
            cout << ss[i] << endl;
        }
    }
}