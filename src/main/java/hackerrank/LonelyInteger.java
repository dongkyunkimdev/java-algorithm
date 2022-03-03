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

public class LonelyInteger {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int result = Result.lonelyinteger(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {

		public static int lonelyinteger(List<Integer> a) {
			int result = -1;

			Collections.sort(a);
			for (int i = 0; i < a.size() - 1; i++) {
				if (a.get(i) != a.get(i + 1)) {
					result = a.get(i);
				}
				if (a.get(i) == a.get(i + 1)) {
					i++;
				}
			}
			if (result == -1) {
				result = a.get(a.size() - 1);
			}

			return result;
		}

	}
}
