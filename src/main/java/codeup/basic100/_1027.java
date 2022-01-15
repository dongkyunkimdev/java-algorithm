package codeup.basic100;

import java.util.Scanner;

public class _1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] arr;

		str = sc.nextLine();
		arr = str.split("\\.");

		System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);
	}
}
