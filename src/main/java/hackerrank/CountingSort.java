package hackerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountingSort {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		List<Integer> result = Result.countingSort(arr);

		bufferedWriter.write(
			result.stream()
				.map(Object::toString)
				.collect(joining(" "))
				+ "\n"
		);

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {

		public static List<Integer> countingSort(List<Integer> arr) {
			int[] temp = new int[100];
			for (int i = 0; i < arr.size(); i++) {
				temp[arr.get(i)]++;
			}

			return IntStream.of(temp).boxed().collect(Collectors.toList());
		}

	}
}
