## OOP-EX2

## part 1: 

in that part we We created several text files and calculated the total number of lines
in these files. We will use three methods:

• Normal method without the use of threads,
• use of threads,
• Use of threadpool 

the function we implement are : 

1. createTextFiles - A function that accepts a natural number n and a number of rows.
and creates n files with this number of lines in each file

2.getNumOfLines - Receives an array with the names of the files,
and returns the total number of lines in all of them together

3.getNumOfLinesThreads -  Receives an array with the names of the files,
and returns the total number of lines in all of them together.
this function will use a class that inherits from the thred class (we called it mythread)

4.getNumOfLinesThreadPool - Receives an array with the names of the files,
and returns the total number of lines in all of them together.
this function will use a class that implements interface callable , such that the method "call" 
calculate how much rows have one file. 

# part 1 - running times:

method 2 : takes the longest time 

method 3: much better than method 2, and very close to method 4. but most of the time
(Especially when the number of files increases) less good than method 4 

method 4: the best running times in most cases

And there is an explanation to that: 

The reason that the best running times are with the use of threadpool is , because it contains an array of threads and enables the reuse of threads that have finished a task. Instead of creating new threads.

The reason that using a regular thread is faster than the function that calculates the tasks one after the other(regulary) is. because the essence of the thread is to perform tasks at the same time. and so that the program is not waiting to the sum of rows of one file for starting to sum another , therefor it is taking less time.

the methods are in "EX2_1" class , yiu can run them there...

## part 2 : 
background
In Java, there is no built-in option to give priority to an asynchronous task (a task that will be executed in a separate thread).
The language does allow you to set a priority for the Thread that runs the task, but not for the task itself.
Therefore, we are in a problem when we want to prioritize an asynchronous task using:

1. Interface <V<Callable. It is an interface that represents a task with a generic return value.
A task that is a type of <V<Callable cannot be executed within a normal Thread, and therefore cannot be assigned to it
indirectly preferred.

2. In ThreadPool, which you put as its task queue Runnable or <V<Callable, since it is not possible to determine
Priority to a specific Thread in the Executor's Threads collection

so in that part we were asked to create a new object that represents an asynchronous task with priority and a new ThreadPool type that supports owning tasks
priority.

#we create two classes:

1. Task - This class extend "FutureTask" and implements Comparable<Task>, Callable.
It Represents a task that can be run asynchronously and can return a value of some type.

2. CustomExecutor-– represents a new type of ThreadPool that supports a queue of priority tasks.
CustomExecutor will execute the tasks according to their priority.
but the The challenge here is that the priority queue that supports threadpool only supports variables that implement runnable but our tasks implement callable because only it returns a value as requested.

What we needed was something that would bridge the callable task and what entered the priority queue - which would be of the runnable type
We used the idea of an adapter (which we learned with design patterns) but instead of creating a new class to bridge, we created an action that accepts a task of callable type and returns the same task only of runnable type so that it can enter the queue.

You will see it in our _____ class


