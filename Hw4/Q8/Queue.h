//Queue.h header file
#include <vector>
//Queue class declaration
class Queue
{
    //Public identifier
    public:
       virtual void add(int value) = 0;
       virtual int remove() = 0;
       virtual bool isEmpty() = 0;
};

//ArrayQueue decleraton
class ArrayQueue : public Queue{

    public:
        void add(int value);
        int remove();
        bool isEmpty();

    private:
        std::vector <int> vec;
};
