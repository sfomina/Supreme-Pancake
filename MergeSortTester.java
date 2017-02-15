/*======================================
  class MergeSortTester

  ALGORITHM: 
  - will return input arr if length is equal to 1
  - splits the input array into half, until the length of the parts is 1
  - at this point, it will merge the adjacent parts that were split together so that the 
    resulting array is sorted
  - when all the parts are merged successfully, the resulting array will be sorted

  BIG-OH CLASSIFICATION OF ALGORITHM: nlog(n)
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/

    public static long time(int[] arr){
	MergeSort runner = new MergeSort();
	long time = System.nanoTime();
	runner.sort(arr);
	time = System.nanoTime() - time;
	return time;
    }
    
    public static void main( String[] args ) 
    {
	int[] test1= new int [1];
	int[] test10 = new int [10];
	int[] test50 = new int [50];
	double a = 0;
	double b = 0;
	double time1 = 0;
	double time10 = 0;
	double time50 = 0;
	
	System.out.println("~~~~~~~~~~ARRAY n=1~~~~~~~~~~~~~~"); 
	int counter = 0;

	while (counter < 9){
	    //populate an array with one item
	    test1[0] = (int) (Math.random() *10);
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test1);
	    System.out.print(" ....\n");
	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test1);
	    b= System.currentTimeMillis();
	    System.out.println("Time: " + (b - a));
	    time1 += b-a;
	    counter ++;
	}
	System.out.println("AVG TIME FOR n=1:" + (time1 *1.0 / 10));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=10~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 10 item array
	    int x = 0;
	    while(x<10){
		test10[x] = (int) (Math.random() * 50);
		x++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test10);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test10);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time10 += b-a;
	    counter ++;
	}
	System.out.println("AVG TIME FOR n=10:" + (time10 *1.0 / 10));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

       	System.out.println("~~~~~~~~~~ARRAY n=50~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 10 item array
	    int y = 0;
	    while(y<50){
		test50[y] = (int) (Math.random() * 50);
		y++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test50);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test50);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time50 += b-a;
	    counter ++;
	}
	System.out.println("AVG TIME FOR n=50:" + (time50 *1.0 / 10));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	
	/*
	System.out.println("Standard nlogn time when n is 9");
	System.out.println("Time merge sort takes to sort array of length 9");
	System.out.println("\n\n\n");
	System.out.println("Unsorted array len 9 : " + time(test1));
	System.out.println("Sorted array len 9 : " + time(test2));
	*/
    }//end main

}//end class
