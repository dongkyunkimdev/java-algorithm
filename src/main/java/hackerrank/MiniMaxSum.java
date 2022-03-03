package hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}

	static class Result {

		public static void miniMaxSum(List<Integer> arr) throws IOException {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			long min = 0, max = 0;
			Collections.sort(arr);

			for (int i = 0; i < arr.size() - 1; i++) {
				min += arr.get(i);
			}
			for (int i = 1; i < arr.size(); i++) {
				max += arr.get(i);
			}
			bw.write(String.valueOf(min));
			bw.write(" ");
			bw.write(String.valueOf(max));
			bw.flush();
			bw.close();
		}

	}
}
