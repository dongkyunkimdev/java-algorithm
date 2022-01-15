package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _1078 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = Arrays.stream(IntStream.range(1, num + 1).toArray())
			.filter(i -> i % 2 == 0)
			.sum();

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
