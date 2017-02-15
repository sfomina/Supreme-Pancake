/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
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
	int[] test1 = {9,6,7,2,8,5,1,3,4};
	System.out.println("Standard nlogn time when n is 9");
	System.out.println("Time merge sort takes to sort array of length 9");
	System.out.println(time(test1));
    }//end main

}//end class
