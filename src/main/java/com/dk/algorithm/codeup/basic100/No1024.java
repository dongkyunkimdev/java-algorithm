package com.dk.algorithm.codeup.basic100;

import java.util.Scanner;

public class No1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		str = sc.nextLine();
		for (char ch : str.toCharArray()) {
			System.out.printf("'%c'\n", ch);
		}
	}
}
