package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1083 {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static final int GAME_START_NUMBER = 1;

	private static void print369GameUntilNum(int gameSeqNum, int gameLastNum) throws IOException {
		if (gameSeqNum % 3 == 0) {
			bw.write("X");
		} else {
			bw.write(String.valueOf(gameSeqNum));
		}
		bw.write(" ");

		if (gameSeqNum < gameLastNum) {
			print369GameUntilNum(++gameSeqNum, gameLastNum);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int gameLastNum = Integer.parseInt(br.readLine());
		print369GameUntilNum(GAME_START_NUMBER, gameLastNum);
		flushBuffer();
	}

	private static void flushBuffer() throws IOException {
		bw.flush();
		bw.close();
	}
}
