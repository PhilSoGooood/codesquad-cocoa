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
		int N = Integer.parseInt(br.readLine());
		int[] scoreArr =  new int[N];
		String[] score = br.readLine().split(" ");
		float M = 0;
		float total = 0;
		for(int i=0; i<N; i++){
			if(Integer.parseInt(score[i]) > M)
				M = Integer.parseInt(score[i]);
			scoreArr[i] = Integer.parseInt(score[i]);
		}
		for(int num:scoreArr){
			total += num/M * 100;
		}
		System.out.println(total / N);
	}
}
