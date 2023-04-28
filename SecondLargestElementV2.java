package com.leetcode;

public class SecondLargestElementV2 {
	
	// TC= O(n)
	// SC=O(1)

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 4, 4 };
		System.out.println(solve(a));

	}

	private static int solve(int[] A) {

		// find the first largest element in array

		int max = A[0];
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			} else if (A[i] < min) {
				min = A[i];
			}
		}

		int secondargestElm = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > min && A[i] < max) {
				secondargestElm = A[i];
			}
		}
		return secondargestElm;

	}

}
