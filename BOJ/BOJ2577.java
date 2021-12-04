import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		String input = Integer.toString(Integer.parseInt(A) * Integer.parseInt(B) * Integer.parseInt(C));
		int num;
		for (int j = 0; j < input.length(); j++) {
			num = input.charAt(j) - '0';
			arr[num]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
