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
