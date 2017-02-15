# Supreme-Pancake
Based on running the mergesort algorithm on many arrays of different lengths, and measuring the time it took in milliseconds, average run times were synthesized. 
Using this data, a graph was plotted to represent it visually. The link is here: https://docs.google.com/spreadsheets/d/1nJfYaayP-T9ycAJQCTNdA-V1wZZR--OjntgAycNBkzo/edit?usp=sharing
The data we've acquired is as follows:
n  Runtime (milliseconds)

1	0

10	4.1

50	24.1

100	51.1

1000	643

Judging from the shape of the graph, we can safely conclude that the runtime of mergesort is O(N)???? It is linear??? Aha! Fear not for the grpah can sometimes be deceptive. Even a nlog(n) graph can appear linear when zoomed in. But if you zoom out and see the BIGGER PICTURE! Like at this link, 
you will find that merge sort is O(nlog(n)); it is log linear.  It looks like a steep line when zoomed out but when zoomed in the range of small numbers it appears as log linear
