package com.leetcode;

public class SecondLargestElementV2 {

	// TC= O(n)
	// SC=O(1)

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 4, 4 };
		System.out.println(solve(a));

	}

	private static int solve(int[] A) {

		if (A.length <= 1) {
			return -1;
		} else if (A.length == 2 && A[0] > A[1]) {
			return A[1];
		}

		int max = A[0];
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			} else if (A[i] < min) {
				min = A[i];
			}
		}

		if (min == max) {
			return -1;
		}

		int secondargestElm = 0;
		for (int i = 0; i < A.length; i++) {

			if (secondargestElm <= A[i] && A[i] > min && A[i] < max) {
				secondargestElm = A[i];
			}
		}
		return secondargestElm;

	}

}
