#include <iostream>
#include <vector>
#include <string>

using namespace std;


template <class T> 
Queue<T>::Queue(int maxCapacity){

	first = 0;
	last = 0;
	size = maxCapacity;
	added = 0;
	my_q = new string [maxCapacity + 1];
}


template <typename T>
void Queue<T>::printQueue(){

	int i = 0;

	while(i < this->added){
		cout << this->my_q[(this->first % this->size) + i] << endl;
		i++;
	}
/*
	for(int i = this->first; i < this->last; i++){
		cout << this->my_q[i] << endl;
	}
*/
}

template <typename T>
void Queue<T>::enqueue(T value)
{

	if((added) == size) throw QueueOverflowException<string>(value);
	my_q[this->last] = value;
	last += 1;
	added += 1;
	if(last == size + 1)last = 0;

}

template <typename T>
T Queue<T>::dequeue(){
	
	if(last == first) throw QueueEmptyException();
	string ret;
	ret = my_q[first];
	my_q[first] = "";
	added -= 1;
	first += 1;
	if(first == size + 1) first = 0;

	return ret;
}