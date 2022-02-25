#include <bits/stdc++.h>

using namespace std;
/*

MAPS: are special arrays in which keys of elements can be negative or very big

even strings.

syntax::
    map<key_datatype , value_datatype> name;
    map<string ,int> m; defines a map in which the keys of elements are strings

    //adding values

    m["hello"] = 50;
    m["world"] = 12;

    // printing

    cout<<m["hello"]<<" "<<m["world"]; // 50 12

*/

int main()
{
    map<int, int> m;

    cout<<"Size: "<<m.size()<<endl;

    cout<<m[50]<<endl; //creates element and initialises with 0;

    cout<<"Size: "<<m.size()<<endl;
    return 0;
}