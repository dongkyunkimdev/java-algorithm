package codeup.basic100;

import java.util.Scanner;

public class _1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a, b, c, d, e;

		n = sc.nextInt();
		a = n / 10000 * 10000;
		b = (n - a) / 1000 * 1000;
		c = (n - a - b) / 100 * 100;
		d = (n - a - b - c) / 10 * 10;
		e = (n - a - b - c) % 10;

		System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]", a, b, c, d, e);
	}
}
