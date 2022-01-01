import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(br.readLine());
		String input = br.readLine();
		long sum = 0;
		long M = 1234567891;
		long r = 1;
		for(int i=0; i<L; i++){
			sum += (input.charAt(i) - 96) * r;
			r = r*31%M;
		}
		bw.write(sum%M+"");
		bw.flush();
		bw.close();
		br.close();
	}
}