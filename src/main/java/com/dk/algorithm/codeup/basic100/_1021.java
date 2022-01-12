package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class _1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char[] data;

		str = sc.nextLine();
		if (str.length() < 51) {
			data = str.toCharArray();
		} else {
			throw new IllegalArgumentException("50자 초과");
		}

		System.out.println(String.valueOf(data));
	}
}
