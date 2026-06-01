package com.dsaLearningSeries.DAA;

public class BubbleSortDemo {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {

            System.out.println("\nPASS " + (i + 1));

            for (int j = 0; j < n - i - 1; j++) {

                System.out.println("\nComparing: " + arr[j] + " and " + arr[j + 1]);

                // Swap if left element is greater
                if (arr[j] > arr[j + 1]) {

                    System.out.println("Swapping " + arr[j] + " and " + arr[j + 1]);

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    System.out.print("Array after swap: ");
                    printArray(arr);
                }
                else {
                    System.out.println("No Swap Needed");

                    System.out.print("Current Array: ");
                    printArray(arr);
                }
            }
        }

        System.out.println("\n\nFinal Sorted Array:");
        printArray(arr);
    }

    // Method to print array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr);
    }
}