package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TimeConversion {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = bufferedReader.readLine();

		String result = Result.timeConversion(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {

		public static String timeConversion(String s) {
			int hh = Integer.valueOf(s.substring(0, 2));
			String ampm = s.substring(8);
			if (ampm.equals("PM") && hh != 12) {
				hh += 12;
			} else if (ampm.equals("AM") && hh == 12) {
				hh -= 12;
			}
			return String.format("%02d", hh) + s.substring(2, 8);
		}

	}
}
