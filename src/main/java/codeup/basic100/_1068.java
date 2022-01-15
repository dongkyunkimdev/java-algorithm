package codeup.basic100;

import java.util.Scanner;

public class _1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;

		score = sc.nextInt();
		evaluateGrade(score);
	}

	static void evaluateGrade(int score) {
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 70 && score <= 89) {
			System.out.println("B");
		} else if (score >= 40 && score <= 69) {
			System.out.println("C");
		} else if (score >= 0 && score <= 39) {
			System.out.println("D");
		}
	}
}
