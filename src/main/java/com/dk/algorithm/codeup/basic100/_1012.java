package com.dk.algorithm.codeup.basic100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1012 {

	public static void main(String[] args) {
		float x;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000000");

		x = sc.nextFloat();
		System.out.println(df.format(x));

	}
}
