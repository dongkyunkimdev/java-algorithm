package codeup.basic100;

import java.util.Scanner;

public class _1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, first, last;
		String[] arr;

		str = sc.nextLine();
		arr = str.split("\\.");
		first = arr[0];
		last = arr[1];

		System.out.println(first);
		System.out.print(last);
	}
}
