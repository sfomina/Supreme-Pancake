/*======================================
  class MergeSortTester

  ALGORITHM: 
  - will return input arr if length is equal to 1
  - splits the input array into half, until the length of the parts is 1
  - at this point, it will merge the adjacent parts that were split together so that the 
    resulting array is sorted
  - when all the parts are merged successfully, the resulting array will be sorted

  BIG-OH CLASSIFICATION OF ALGORITHM: nlog(n)
 

  Mean execution times for dataset of size n:
  Batch size:10
  n=1       time: 
  n=10      time: 
  n=50      time: 
  n=100     time: 
  n=1000    time: 

  ANALYSIS:
    
  ======================================*/

public class MergeSortTester 
{

    /******************************
     Creates 10 arrays of 1,10,50,100,and 1000 items and finds the avg time in miliseconds it takes to complete a merge sort, printing out a trace diagram for each test case.
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
	int[] test5 = new int [5];
	int[] test50 = new int [50];
	int[] test100 = new int[100];
	int[] test1000 = new int[1000];
	
	double a = 0;
	double b = 0;
	double time1 = 0;
	double time5 = 0;
	double time10 = 0;
	double time50 = 0;
	double time100 = 0;
	double time1000 = 0;
	
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

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=5~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 5 item array
	    int p = 0;
	    while(p<5){
		test5[p] = (int) (Math.random() * 50);
		p++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test5);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test5);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time5 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

       	System.out.println("~~~~~~~~~~ARRAY n=50~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 50 item array
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

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=100~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 100 item array
	    int z = 0;
	    while(z<100){
		test100[z] = (int) (Math.random() * 100);
		z++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test100);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test100);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time100 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("~~~~~~~~~~ARRAY n=1000~~~~~~~~~~~~~~");
	counter = 0;
	while (counter<9){
	    //populate a 1000 item array
	    int q = 0;
	    while(q<1000){
		test1000[q] = (int) (Math.random() * 1000);
		q++;
	    }
	    System.out.println("Testing on array ");
	    MergeSort.printArray(test1000);
	    System.out.print(" ....\n");

	    //start stopwatch
	    a = System.currentTimeMillis();
	    MergeSort.sort(test1000);
	    b= System.currentTimeMillis();

	    System.out.println("Time: " + (b - a));
	    time1000 += b-a;
	    counter ++;
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.println("AVG TIME FOR n=1:" + (time1 *1.0 / 10));
	System.out.println("AVG TIME FOR n=5:" + (time5 *1.0 / 10));		
	System.out.println("AVG TIME FOR n=10:" + (time10 *1.0 / 10));
	System.out.println("AVG TIME FOR n=50:" + (time50 *1.0 / 10));
	System.out.println("AVG TIME FOR n=100:" + (time100 *1.0 / 10));
	System.out.println("AVG TIME FOR n=1000:" + (time1000 *1.0 / 10));		
	/*
	System.out.println("Standard nlogn time when n is 9");
	System.out.println("Time merge sort takes to sort array of length 9");
	System.out.println("\n\n\n");
	System.out.println("Unsorted array len 9 : " + time(test1));
	System.out.println("Sorted array len 9 : " + time(test2));
	*/
    }//end main

}//end class
