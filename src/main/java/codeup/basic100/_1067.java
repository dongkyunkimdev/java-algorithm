package codeup.basic100;

import java.util.Scanner;

public class _1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		dividePlusMinus(n);
		divideOddEven(n);
	}

	static void dividePlusMinus(int n) {
		if (n > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}

	static void divideOddEven(int n) {
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
