#include <iostream>
#include <map>
using namespace std;

int main() {
    map<char, int> m;
    m['b'] = 2;
    m['a'] = 1;
    m['s'] = 3;
    m['b'] = 4; // Overwrites previous 'b' value

    // Check if key '2' exists — but '2' is a char, not int
    if (m.count('2')) {
        cout << "yes" << endl;
    }

    // Print all key-value pairs
    for (auto i : m) {
        cout << i.first << " -> " << i.second << endl;
    }
    

    return 0;
}