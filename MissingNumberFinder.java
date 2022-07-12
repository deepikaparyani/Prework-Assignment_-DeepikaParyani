/*
You are provided with an array of the size n-1. It contains distinct integers in the range of 1 to n. 
Your task is to find the missing number.
Input format:
Line 1 will take the value of n.
Line 2 will take the array's contents where numbers will be in the 1-n range.
Sample Test case:
5
1 2 3 4 
Output: 
4
*/

import java.util.Scanner;
class MissingNumberFinder {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int size = in.nextInt();
 int[] arr = new int[size-1];
 for(int i=0;i<size-1;i++)
 arr[i] = in.nextInt();
 System.out.println(missingNumberFinder(arr, size));
 }
 static int missingNumberFinder(int array[], int n) {
 // write your code here
      int sum=(n*(n+1))/2;
      for(int i=0;i<n-1;i++)
        sum-=array[i];
      return sum;

 }
}