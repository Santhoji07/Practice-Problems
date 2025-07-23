#include <iostream>
using namespace std;

class ATM
{
    int pin;
    int balance;
public:
    ATM()
    {
        pin = 1234;
        balance = 420;
    }

    void print_balance() {
        cout << balance << endl;
    }

    void set_pin(int old_pin, int new_pin)
    {
        if (old_pin == pin)
        {
            if (new_pin == pin)
            {
                cout << "New PIN cannot be same as old PIN\n";
            }
            else
            {
                pin = new_pin;
                cout << "Updated successfully\n";
            }
        }
        else {
            cout << "Invalid old pin\n";
        }
    }
};

int main() {
    ATM A1;
    A1.print_balance();
    A1.set_pin(1234, 1234); 
    A1.set_pin(1234, 5673); 
    A1.set_pin(1234, 2770); 
    A1.set_pin(5673, 5673); 
    A1.set_pin(5673, 1234); 
}