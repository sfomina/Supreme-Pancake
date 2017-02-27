# Supreme-Pancake
Based on running the mergesort algorithm on many arrays of different lengths, and measuring the time it took in milliseconds, average run times were synthesized. 
Using this data, a graph was plotted to represent it visually. The link is here: https://docs.google.com/spreadsheets/d/1nJfYaayP-T9ycAJQCTNdA-V1wZZR--OjntgAycNBkzo/edit?usp=sharing
The data we've acquired is as follows (in the data table other graphs are for reference):



![Alt text](https://github.com/sfomina/Supreme-Pancake/blob/master/graphs.PNG?raw=true"Graphs")



 As seen in the image, the run time of merge sort appears to be linear but when lookin closely and in particulr zooming into the smaller ranges one can see that the runtime of merge sort is O(nlog(n)). By playing with the coefficients of y = nlog(n), it becomes more clear that this is, in fact, corresponds to the data gathered.
 
 
 
 
 
Besides the graph, there is also another way to envision the runtime of Merge sort. Merge sort divides the given array into two as many times as necessary to get arrays with only one number. This is where the log(n) comes from, because each array has to be subdivided log(n) number of times, since it's being divided by two every time. The n part comes from the recombining. The recombining occurs after every split into 2, and recombination requires n number of operations. Say I have an origional array of length two, I must subdivide the array once to acquire 2 sorted arrays of length one. However, when I combine the two sorted arrays, I am combining / sorting two numbers, which is the length of the origional array I started with. 







A quick summary of how mergesort works. Given any array, the array will be subdivided until it is for certain sorted, in other words, it is of length one. After two sorted array get sorted, the sorted arrays are combined. The recombination mechanism is as follows: Compare the first element in both arrays and place the smaller element in the answer array. Repeat this process until both arrays run out of elements. 
