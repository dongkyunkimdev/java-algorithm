package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	private static void setPeople(int[] people) {
		int size = st.countTokens();
		for (int i = 0; i < size; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(people);
	}

	private static int getMinTimeTakeout(int[] people) {
		int result = 0;
		int mulNum = people.length;
		for (int person : people) {
			result += person * mulNum--;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		br.readLine();
		st = new StringTokenizer(br.readLine());
		int[] people = new int[st.countTokens()];
		setPeople(people);
		bw.write(String.valueOf(getMinTimeTakeout(people)));
		bw.flush();
		bw.close();
	}
}
