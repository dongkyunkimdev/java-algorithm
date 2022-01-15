package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1090 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer st;

	private static long getNumInGeometricProgression(int startNum, int geometricNum, int numCnt) {
		return (long) (startNum * Math.pow(geometricNum, numCnt - 1));
	}

	private static void writeNumInBuffer(long num) throws IOException {
		bw.write(String.valueOf(num));
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int startNum = Integer.parseInt(st.nextToken());
		int geometricNum = Integer.parseInt(st.nextToken());
		int numCnt = Integer.parseInt(st.nextToken());

		writeNumInBuffer(getNumInGeometricProgression(startNum, geometricNum, numCnt));
		flushBuffer();
	}
}
