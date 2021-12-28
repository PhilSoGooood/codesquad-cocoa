import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		String tmp = "";
		Arrays.sort(arr);
		for (int i = N - 2; i >= 0; i--) {
			for (int j = 0; j < i + 1; j++) {
				if (arr[j].length() > arr[j + 1].length()) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp; }
				}
			}
			print:
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[i].equals(arr[j]))
						continue print;
				}
				bw.write(arr[i] + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		}
	}
