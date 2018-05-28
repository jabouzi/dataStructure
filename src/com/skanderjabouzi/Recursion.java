package com.skanderjabouzi;

import com.skanderjabouzi.libs.*;

import java.util.Arrays;

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
}
