package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class No1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, first, last;
		str = sc.nextLine();
		String[] arr = str.split("-");
		first = arr[0];
		last = arr[1];

		System.out.printf("%s%s", first, last);

	}
}
