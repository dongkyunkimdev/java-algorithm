package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class _1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(Math.min((Math.min(a, b)), c));
	}
}
