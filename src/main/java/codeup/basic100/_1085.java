package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1085 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static void calStorageCapacity(int hz, int bit, int channel, int second)
		throws IOException {
		long capacity = (long)hz * bit * channel * second;
		writeCapacityInBuffer(convertBitToMb(capacity));
	}

	private static float convertBitToMb(long capacity) {
		return Math.round((float) capacity / 8 / 1024 / 1024 * 10) / (float) 10;
	}

	private static void writeCapacityInBuffer(float capacity) throws IOException {
		bw.write(String.valueOf(capacity));
		bw.write(" MB");
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int hz = Integer.parseInt(st.nextToken());
		int bit = Integer.parseInt(st.nextToken());
		int channel = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());

		calStorageCapacity(hz, bit, channel, second);
		flushBuffer();
	}
}
