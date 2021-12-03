//Jacob Isber
//Homework 5, Question 4
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//
// Created by sr117 on 2/28/2021.
//
#include "queue.h"

typedef struct {
    void* qp;
    int first_index;
    int last_index;
}myQueue;

//Creats new queue 
void *queue_new(int numItems)
{
    myQueue *q = (myQueue *)malloc(sizeof(myQueue));
    q->qp = (char **)malloc(numItems * 8);
    q->first_index = 0;
    q->last_index = 0;
    return (void *) q;
}

//Enqueue func
void queue_enqueue(void *q, void *item)
{   
    myQueue* add_q = (myQueue*) q;
    int last = add_q->last_index;
    //(char**)(add_q)->qp[last] = (char *) item;
    ((char **)((myQueue*)q)->qp)[((myQueue*)q)->last_index] = (char *)item;
    add_q->last_index += 1;
}

//Dequeue func
void *queue_dequeue(void *q)
{   
    myQueue* add_q = (myQueue*) q;
    int first = add_q->first_index;
    char* tmp = ((char **) add_q->qp)[first];
    add_q->first_index  += 1;
    return (void *) tmp;
}

//Checks if queueu is empty 
int queue_isEmpty(void *q)
{
    myQueue* add_q = (myQueue*) q;
    if(add_q->last_index == add_q->first_index)
        return 1;
    
    return 0;
}