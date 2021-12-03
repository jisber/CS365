//Jacob Isber driver code for Homework 4 question 8
#include <iostream>
using namespace std;
#include "Queue.h"

int main() {
    ArrayQueue queue;
    int num = 3;
    queue.add(num);
    num = 10;
    queue.add(num);
    num = 5;
    queue.add(num);

    for(int i = 0; i < 2; ++i)
    {
        cout << queue.remove() << endl;
    }

    num = 6;
    queue.add(num);
    num = 9;
    queue.add(num);
    num = 12;
    queue.add(num);

    while(!queue.isEmpty())
    {
        cout << queue.remove() << endl;
    }

    return 0;
}
