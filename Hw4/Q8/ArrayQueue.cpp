//ArrayQueue cpp file
#include "Queue.h"
#include <iostream>

using namespace std;
//ArrayQueue declaration

//Remove function
int ArrayQueue::remove() {

    if(!vec.empty()) {
        int temp = vec[0];
        vec.erase(vec.begin());
        return temp;
    }
    else
    {
        std::cout << "List is empty" << endl;
        return -9999;
    }
}
//Add
void ArrayQueue::add(int value) {
   vec.push_back(value);
}
//Checks if it is empty
bool ArrayQueue::isEmpty() {
    return vec.empty();
}