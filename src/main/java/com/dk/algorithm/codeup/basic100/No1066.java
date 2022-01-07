package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class No1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		divideOddEven(a);
		divideOddEven(b);
		divideOddEven(c);
	}

	static void divideOddEven(int n) {
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
