import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			double total = 0;
			double overNum = 0;
			String[] input = br.readLine().split(" ");
			int[] score = new int [input.length];
			for(int i=0; i<score.length;i++){
				score[i] = Integer.parseInt(input[i]);
			}
			for(int i=1; i<score.length; i++){
				total += score[i];
			}
			double avg = total / score[0];
			for(int i=1; i<score.length; i++){
				if(score[i] > avg){
					overNum++;
				}
			}
			double result = Math.round(overNum * 100000.0 / score[0]) / 1000.0;

			System.out.printf("%.3f%%%n", result);

		}
	}
}

