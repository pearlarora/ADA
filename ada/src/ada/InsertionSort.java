package ada;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextInt();
        }
        Insertion(ar);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(ar));
    }

    private static void Insertion(int[] ar) {
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = i+1; j >0  ; j--) {
                if(ar[j]<ar[j-1])
                {
                    BubbleSort.swap(j,j-1,ar);
                }
                else {
                    break;
                }
            }
        }
    }

}
