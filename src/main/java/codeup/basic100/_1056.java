package codeup.basic100;

import java.util.Scanner;

public class _1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((a == 1 && b == 0) || (a == 0 && b == 1) ? 1 : 0);
	}
}
