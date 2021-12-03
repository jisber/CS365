template <class T>
class QueueOverflowException{
	public:
	QueueOverflowException(T itemm){
		item = itemm;
	}

	T item;

	std::string getMessage(){
		return "queue full: cannot enqueue " + item + "\n";
	}


};

class QueueEmptyException{
	
	public:
	std::string getMessage(){
		return "queue empty: cannot dequeue\n";
	}
};

template <class T>
class Queue {
	public:
		Queue(int maxCapacity);
		void printQueue();
		void enqueue(T value);
		T dequeue();

		int first, last,size, count;
		T *my_q;
};
    
#include "Queue.cpp"