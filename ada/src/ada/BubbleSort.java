package ada;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= s.nextInt();
        }
        Bubble(ar);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(ar));
    }

    private static void Bubble(int[] ar) {
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-1 ; j++) {
                if(ar[j]>ar[i])
                {
                    swap(i,j,ar);
                }
            }
        }
    }
    public static void swap(int first, int second, int[] ar)
    {
        int temp;
        temp = ar[first];
        ar[first]= ar[second];
        ar[second] = temp;
    }

}
