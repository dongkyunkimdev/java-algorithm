package hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}

	static class Result {

		public static void plusMinus(List<Integer> arr) throws IOException {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int plusCnt = 0, minusCnt = 0, zeroCnt = 0;

			for (int i = 0; i < arr.size(); i++) {
				Integer n = arr.get(i);
				if (n == 0) {
					zeroCnt++;
				} else if (n > 0) {
					plusCnt++;
				} else {
					minusCnt++;
				}
			}

			bw.write(String.format("%.6f", (float) plusCnt / arr.size()));
			bw.newLine();
			bw.write(String.format("%.6f", (float) minusCnt / arr.size()));
			bw.newLine();
			bw.write(String.format("%.6f", (float) zeroCnt / arr.size()));
			bw.flush();
			bw.close();
		}

	}
}
