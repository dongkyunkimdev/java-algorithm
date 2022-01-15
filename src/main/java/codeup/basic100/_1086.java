package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class _1086 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;
	private static DecimalFormat df = new DecimalFormat("0.00");

	private static void calStorageCapacity(int horizonResolution, int verticalResolution, int bit)
		throws IOException {
		int capacity = horizonResolution * verticalResolution * bit;
		writeCapacityInBuffer(convertBitToMb(capacity));
	}

	private static String convertBitToMb(int capacity) {
		return df.format(Math.round((float) capacity / 8 / 1024 / 1024 * 100) / (float) 100);
	}

	private static void writeCapacityInBuffer(String capacity) throws IOException {
		bw.write(capacity);
		bw.write(" MB");
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int horizonResolution = Integer.parseInt(st.nextToken());
		int verticalResolution = Integer.parseInt(st.nextToken());
		int bit = Integer.parseInt(st.nextToken());

		calStorageCapacity(horizonResolution, verticalResolution, bit);

		flushBuffer();
	}
}
