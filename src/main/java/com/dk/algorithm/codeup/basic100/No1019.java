package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class No1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int y, m, d;

		str = sc.nextLine();
		String[] arr = str.split("\\.");

		y = Integer.parseInt(arr[0]);
		m = Integer.parseInt(arr[1]);
		d = Integer.parseInt(arr[2]);

		System.out.printf("%04d.%02d.%02d", y, m, d);

	}
}
