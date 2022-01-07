package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class No1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f"
			, a + b
			, a - b
			, a * b
			, a / b
			, a % b
			, (double) a / b);
	}
}
