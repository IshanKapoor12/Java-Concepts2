// Sorting Techniques:
// 1. Bubble Sort
// 2. Selection Sort
// 3. Insertion Sort
// 4. Merge Sort
// 5. Quick Sort

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        // Time Complexity => O(n^2)
        String inc1 = BubbleSort(arr, true, false);
        System.out.println("Increasing Order using Bubble Sort: " + inc1);

        String dec1 = BubbleSort(arr, false, true);
        System.out.println("Decreasing Order using Bubble Sort: " + dec1);

        // Selection Sort
        // Time Complexity => O(n^2)
        String inc2 = SelectionSort(arr, true, false);
        System.out.println("Increasing Order using Selection Sort: " + inc2);

        String dec2 = SelectionSort(arr, false, true);
        System.out.println("Decreasing Order using Selection Sort: " + dec2);

        // Insertion Sort
        // Time Complexity => O(n^2)
        String inc3 = SelectionSort(arr, true, false);
        System.out.println("Increasing Order using Insertion Sort: " + inc3);

        String dec3 = SelectionSort(arr, false, true);
        System.out.println("Decreasing Order using Insertion Sort: " + dec3);

        // Merge Sort
        // Time Complexity => O(n*log(n))
        divide(arr, 0, n-1);
        System.out.println("Increasing order using Merge Sort: " + Arrays.toString(arr));

        // Quick Sort
        // Time Complexity => O(n*log(n))
        quickSort(arr, 0, n-1);
        System.out.println("Increasing order using Quick Sort: " + Arrays.toString(arr));
    }

    // Bubble Sort
    public static String BubbleSort(int[] arr, boolean inc, boolean dec){

        int n = arr.length;

        if(inc) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else if(dec) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("Invalid Input");
        }

        return Arrays.toString(arr);
    }

    // Selection Sort
    public static String SelectionSort(int[] arr, boolean inc, boolean dec){

        int n = arr.length;

        if(inc) {
            for (int i = 0; i < n - 1; i++) {
                int smallest = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[smallest] > arr[j]) {
                        smallest = j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        } else if(dec) {
            for (int i = 0; i < n - 1; i++) {
                int largest = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[largest] < arr[j]) {
                        largest = j;
                    }
                }
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;
            }
        } else {
            System.out.println("Invalid Input");
        }

        return Arrays.toString(arr);
    }

    // Insertion Sort
    public static String InsertionSort(int[] arr, boolean inc, boolean dec){

        int n = arr.length;

        if(inc) {
            for (int i = 0; i < n; i++) {
                int current = arr[i];
                int j = i-1;
                while(j >= 0 && current < arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }

                arr[j+1] = current;
            }
        } else if(dec) {
            for (int i = 0; i < n; i++) {
                int current = arr[i];
                int j = i-1;
                while(j >= 0 && current > arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }

                arr[j+1] = current;
            }
        } else {
            System.out.println("Invalid Input");
        }

        return Arrays.toString(arr);
    }

    // Merge Sort
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while(i <= mid){
            merged[k++] = arr[i++];
        }

        while(j <= ei){
            merged[k++] = arr[j++];
        }

        for(int p=0, q=si; p<merged.length;p++, q++){
            arr[q] = merged[p];
        }
    }

    public static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    // Quick Sort
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
}