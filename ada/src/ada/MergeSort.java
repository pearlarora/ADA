package ada;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random random = new Random();
//		System.out.println("Enter the no of elements: ");
//		int n = s.nextInt();
		int[] ar = new int[100];
//		System.out.println("Enter array elements: ");
		for (int i = 0; i <ar.length ; i++) {
//			ar[i]= s.nextInt();
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
		mergeSort(ar, 0, ar.length-1);
		long endTime1   = System.nanoTime();
	    long totalTime1 = endTime1 - startTime1;
		System.out.println("Time taken (in nano seconds): "+totalTime1);
		long startTime2 = System.nanoTime();
		mergeSort(ascendingOrderNumbers, 0, ascendingOrderNumbers.length-1);
		long endTime2   = System.nanoTime();
	    long totalTime2 = endTime2 - startTime2;
		System.out.println("Time taken (in nano seconds): "+totalTime2);
		long startTime3 = System.nanoTime();
		mergeSort(descendingOrderNumbers, 0, descendingOrderNumbers.length-1);
		long endTime3   = System.nanoTime();
	    long totalTime3 = endTime3 - startTime3;
		System.out.println("Time taken (in nano seconds): "+totalTime3);
	}

	static void Merge(int array[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = array[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = array[q + 1 + j];

		int i, j, k;
		i = 0;
		j = 0;
		k = p;

		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = M[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = M[j];
			j++;
			k++;
		}
	}

	static void mergeSort(int array[], int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			Merge(array, left, mid, right);
		}
	}

}
