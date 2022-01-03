import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long answer = 0;
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<N+1; i++){
			answer+=(N/i)*i;
		}
		bw.write(answer+"");
		bw.flush();
		bw.close();
		br.close();
	}
}