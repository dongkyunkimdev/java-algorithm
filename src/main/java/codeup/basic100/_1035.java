package codeup.basic100;

import java.util.Scanner;

public class _1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		str = sc.nextLine();
		System.out.printf("%o", Integer.parseInt(str, 16));
	}
}
