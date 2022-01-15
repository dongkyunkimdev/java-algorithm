package codeup.basic100;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.printf("%d\n%.1f", a + b + c, (a + b + c) / (double)3);
	}
}
