package com.skanderjabouzi;

import com.skanderjabouzi.libs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Recursion {

    public int countWays(int n) {
        System.out.println(" n : " + n);
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            System.out.println( n +  " + countWays(" + n + " - 1) ");
            return n + countWays(n - 1);
        }
    }

    public void test() {
        AssortedMethods assortedMethods = new AssortedMethods();
        int size = 5;
        boolean[][] maze = assortedMethods.randomBooleanMatrix(size, size, 70);
        assortedMethods.printMatrix(maze);
    }

    public int getTriNumber(int num) {

        System.out.println("NUM : " + num);

        if (num == 1) {

            System.out.println("getTN(" + (num) + ")" + " Returned 1 ");

            return 1;
        } else {

            int result = num + getTriNumber(num - 1);
            System.out.print("getTN(" + (num) + ")" +  " Returned " + result);
            System.out.println(" [ " + num + " + getTN(" + (num - 1) + ") ]") ;
            return  result;
        }
    }

    public int factoriel(int n) {
        System.out.println(" N: " + n);
        if (n < 0) {
            System.out.println("F(" + (n) + ")" + " Returned -1 ");
            return -1;
        } else if (n == 0) {
            System.out.println("F(" + (n) + ")" + " Returned 0 ");
            return 1;
        } else {
            int res = n * factoriel(n - 1);
            System.out.print("F(" + (n) + ")" + " Returned " + res);
            System.out.println(" [ " + n + " x F(" + (n - 1) + ") ]") ;
            return res;
        }
    }

    public int fibo(int n) {
        System.out.println(" N: " + n);
        if (n < 2) {
            System.out.println("F(" + (n) + ")" + " Returned " + n);
            return n;
        }
        int res = fibo(n - 1) + fibo(n - 2);
        System.out.print("F(" + (n) + ")" + " Returned " + res);
        System.out.println(" [ F(" + (n - 1) + ") + F(" + (n - 2) + ") ]") ;
        return res;
    }

    public int fib2(int n) {
        System.out.println(" N : " + n);
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int res = fib2(n, nums);
        return res;
    }

    int fib2(int i, int[] nums) {
        System.out.print(Arrays.toString(nums));
        System.out.println(" I : " + i);
        if (i < 2) {
            System.out.println("F2(" + (i) + ")" + " Returned nums[" + i + "] " + nums[i]);
            return nums[i];
        }

        if (nums[i] == 0) {
            nums[i] = fib2(i - 1, nums) + fib2(i - 2, nums);
            System.out.print("F(" + (i) + ")" + " Returned nums[" + i + "] " + nums[i]);
            System.out.println(" [ F(" + (i - 1) + ") + F(" + (i - 2) + ") ]");
        }

        return nums[i];
    }

    int mult(int num, int mult) {
        return multRecursive(num, num, mult);
    }

    int multRecursive(int num, int newnum, int mult) {
        if (mult == 1) return newnum;

//        System.out.println("NUM + " + num + " MUL : " + mult);
        return multRecursive(num, newnum + num, mult - 1);
    }

    int mult2(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        else if( num2 < 0 ) {
            return - num1 + mult2(num1, num2 + 1);
        }

        else {
            return num1 + mult2(num1, num2 - 1);
        }
    }

    void findTriplets(ArrayList<Integer> arr) {
        if (arr.size() < 3) return;
        for(int i = 1; i < arr.size() - 1; i++) {
            System.out.println(arr.get(0) + " + " + arr.get(i)+ " + " + arr.get(i + 1));
        }
        findTriplets((ArrayList<Integer>) arr.subList(1, arr.size()));
    }

    void findTriplets2(int[] a, int sum) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], a[i]);
        }

        if (a.length == 3 && a[0] + a[1] + a[2] == sum) {
            System.out.println(a[0] + " + " + a[1] + " + " + a[2]);
            return;
        }

        for (int i = 0; i < a.length - 2; i++){
            for (int j = i + 1; j < a.length; j++){
                int diff = sum - (a[i] + a[j]);
                if (hm.get(diff) != null) System.out.println(+ a[i] + " + " + a[j] +  " + " + diff);
            }
        }
    }

    int zeros2Left(int[] a) {
        int countZeros = 0;
        int bIndex = 0;
        int[] b = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[bIndex] = a[i];
                bIndex++;
            } else {
                countZeros++;
            }
        }

        a = b;
        System.out.println(Arrays.toString(a));
        return a.length - countZeros - 1;
    }

    void stockPrice(int[] s) {
        int min = s[0];
        int max = s[0];
        int oldMinIndex = 0;
        int currMinIndex = 0;
        int currMaxIndex = 0;
        int diff = 0;

        for (int i = 1; i < s.length; i++) {
            if (s[i] < max) {
                oldMinIndex = currMinIndex;
                currMinIndex = i;
                min = s[i];
                max = s[i];
            } else if (s[i] > max) {
                if (s[i] - min > diff) {
                    currMaxIndex = i;
                    max = s[i];
                    diff = max - min;
                    System.out.println("min : " + min + " max : " + max + " diff : " + diff);
                }
            }
        }

        if (currMinIndex > currMaxIndex) {
            min = s[oldMinIndex];
            max = s[currMaxIndex];
        }
        System.out.println("Buy : " + min + " Sell : " + max + " Profit : " + diff);
    }

    boolean isBST(ArrayList<Integer> inorder) {
        for(int i = 0; i < inorder.size() - 1; i++) {
            if (inorder.get(0).compareTo(inorder.get(i + 1)) > 0){
                return false;
            }
        }

        return true;
    }

//    int findPivot(int arr[], int low, int high)
//    {
//        // base cases
//        if (high < low)
//            return -1;
//        if (high == low)
//            return low;
//
//        /* low + (high - low)/2; */
//        int mid = (low + high)/2;
//        if (mid < high && arr[mid] > arr[mid + 1])
//            return mid;
//        if (mid > low && arr[mid] < arr[mid - 1])
//            return (mid-1);
//        if (arr[low] >= arr[mid])
//            return findPivot(arr, low, mid-1);
//        return findPivot(arr, mid + 1, high);
//    }

    int findPivot(int[] arr, int min, int max) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return 0;
        int mid = (max - min) / 2 + min;
        if (arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (arr[min] < arr[mid]) {
            return findPivot(arr, mid + 1, max);
        }

        return findPivot(arr, min, mid);
    }

    int binarySearch(int[] arr, int num, int min, int max) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        int mid = (max - min) / 2 + min;
        if (arr[mid] == num) return mid;
        if (arr[mid] < num) return binarySearch(arr, num, mid + 1,  max);
        return binarySearch(arr, num, min, mid);
    }

    int findInRotArr(int[] a, int num) {
        int pivot = findPivot(a, 0, a.length);
        if (a[pivot] == num) return pivot;
//        if (a[pivot] > num && a[a.length - 1] > num) return binarySearch(a, num,pivot + 1, a.length);
        if (a[pivot] > num && a[a.length - 1] < num) return binarySearch(a, num, 0, pivot);
        return binarySearch(a, num, pivot + 1, a.length);
    }
}
