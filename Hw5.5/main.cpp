#include <iostream>
#include "Queue.h"
#include <string>

using namespace std;

int main()
{
    int max;
    cin >> max;
    Queue<string> q(max);
    string command;
    while(cin >> command)
    {
        if(command == "enqueue")
        {   
            string val;
            cin >> val;
            try 
            {
                q.enqueue(val);
            }
            catch(QueueOverflowException<string> &e)
            {
                cout << e.getMessage();
            }
        }
        else if(command == "dequeue")
        {
            string r;
            try{
                r = q.dequeue();
            }catch(QueueEmptyException &e){
                cout << e.getMessage();
            }
            
            if(r != "") cout << "deqeueued: " << r << endl;
        }
        else if(command == "print")
        {
            cout << "queue contents" << endl;
            q.printQueue();
        }
    }
    return 0;
}