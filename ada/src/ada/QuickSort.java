package ada;

import java.util.Random;
//import java.util.Scanner;

public class QuickSort {
	
	static Integer count;

	public static void main(String[] args) { 
		
		count = 0;
//		Scanner s = new Scanner(System.in);
//        System.out.println("Enter the no of elements: ");
//        int n = s.nextInt();
//        int[] ar = new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i <ar.length ; i++) {
//            ar[i]= s.nextInt();
//        } 
		
		Random random = new Random();
		int[] ar = new int[100];
		for (int i = 0; i <ar.length ; i++) {
			ar[i] = random.nextInt();
		}
        
        int[] ascendingOrderNumbers=new int[100];
		int[] descendingOrderNumbers=new int[100];
		for (int i = 0; i < 100; i++){
			ascendingOrderNumbers[i] = i;
        }
        for (int i = 100; i > 0; i--){
			descendingOrderNumbers[100 - i] = i;
        }
        
		long startTime1 = System.nanoTime();
		quickSort(ar, 0, 100-1);
		long endTime1   = System.nanoTime();
	    long totalTime1 = endTime1 - startTime1;
		System.out.println("\nTime taken (in nano seconds): "+totalTime1);
		System.out.println("The sorted array is: ");  
		for(int i = 0;i<100;i++)  
			System.out.print(ar[i]+" "); 
		System.out.println("\nThe no. of times the recursive function is called is: "+count); 
		
		count = 0;
		long startTime2 = System.nanoTime();
		quickSort(ascendingOrderNumbers, 0, ascendingOrderNumbers.length-1);
		long endTime2   = System.nanoTime();
	    long totalTime2 = endTime2 - startTime2;
		System.out.println("\nTime taken for ascending order (in nano seconds): "+totalTime2);
		System.out.println("The sorted array is: ");  
		for(int i = 0;i<100;i++)  
			System.out.print(ar[i]+" "); 
		System.out.println("\nThe no. of times the recursive function is called is: "+count); 
		
		count = 0;
		long startTime3 = System.nanoTime();
		quickSort(descendingOrderNumbers, 0, descendingOrderNumbers.length-1);
		long endTime3   = System.nanoTime();
	    long totalTime3 = endTime3 - startTime3;
		System.out.println("\nTime taken for descending order (in nano seconds): "+totalTime3);
		System.out.println("The sorted array is: ");  
		for(int i = 0;i<100;i++)  
			System.out.print(ar[i]+" "); 
		System.out.println("\nThe no. of times the recursive function is called is: "+count); 
		
	}  
	public static int partition(int a[], int beg, int end)  
	{  

		int left, right, temp, loc, flag;     
		loc = left = beg;  
		right = end;  
		flag = 0;  
		while(flag != 1)  
		{  
			while((a[loc] <= a[right]) && (loc!=right))  
				right--;  
			if(loc==right)  
				flag =1;  
			else if(a[loc]>a[right])  
			{  
				temp = a[loc];  
				a[loc] = a[right];  
				a[right] = temp;  
				loc = right;  
			}  
			if(flag!=1)  
			{  
				while((a[loc] >= a[left]) && (loc!=left))  
					left++;  
				if(loc==left)  
					flag =1;  
				else if(a[loc] <a[left])  
				{  
					temp = a[loc];  
					a[loc] = a[left];  
					a[left] = temp;  
					loc = left;  
				}  
			}  
		}  
		return loc;  
	}  
	static void quickSort(int a[], int beg, int end)  
	{  

		int loc; 
		count++;
		if(beg<end)  
		{  
			loc = partition(a, beg, end);  
			quickSort(a, beg, loc-1);  
			quickSort(a, loc+1, end);  
		}  
	}  

}
