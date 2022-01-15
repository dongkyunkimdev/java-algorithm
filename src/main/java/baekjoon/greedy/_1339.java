package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1339 {

	private static class Alphabet implements Comparable<Alphabet> {

		private char alphabet;
		private int digit;

		public Alphabet(char alphabet, int digit) {
			this.alphabet = alphabet;
			this.digit = digit;
		}

		@Override
		public int compareTo(Alphabet o) {
			return Integer.compare(o.digit, this.digit);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Character, Integer> weight = new HashMap<>();
		Map<Character, Integer> alphabetVal = new HashMap<>();
		List<Alphabet> list = new ArrayList<>();
		int val = 9;
		int cnt = Integer.parseInt(br.readLine()); // 1 <= cnt <= 10
		String[] arr = new String[cnt];
		int ans = 0;

		// 입력되는 알파벳의 가중치의 누적값을 map에 저장
		for (int i = 0; i < cnt; i++) {
			String s = br.readLine();
			arr[i] = s;
			int length = s.length();
			for (char ch : s.toCharArray()) {
				weight.put(ch, (int) (weight.getOrDefault(ch, 0) + Math.pow(10, (length-- - 1))));
			}
		}
		// Alphabet 객체 List로 저장
		for (Character ch : weight.keySet()) {
			list.add(new Alphabet(ch, weight.get(ch)));
		}
		// 가중치의 내림차순으로 정렬
		Collections.sort(list);
		// 가중치가 높은 알파벳부터 9,8,7...1,0으로 대체
		for (Alphabet alphabet : list) {
			alphabetVal.put(alphabet.alphabet, val--);
		}
		// 알파벳들을 매칭되는 숫자 * 가중치하여 ans에 +
		for (String s : arr) {
			int length = s.length();
			for (char ch : s.toCharArray()) {
				ans += alphabetVal.get(ch) * Math.pow(10, length-- - 1);
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
