package com.leetcode;

public class SecondLargestElementV1 {

	// TC= O(nlogn)
	// SC=O(1)
	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 4, 4 };
		System.out.println(solve(a));

	}

	public static int solve(int[] A) {

		int n = A.length;
		if (n < 2) {
			return -1;
		}
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		int second_largest = -1;
		for (int j = n - 2; j >= 0; j--) {
			if (A[j] != A[n - 1]) {
				second_largest = A[j];
				break;
			}
		}

		return second_largest;

	}

}
