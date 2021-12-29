import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		Character[] arr = new Character[input.length()];
		for(int i=0; i< arr.length; i++){
			arr[i] = input.charAt(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}