import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[42];
		int num;
		int remain;
		int ans = 0;
		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			remain = num % 42;
			arr[remain]++;
		}
		for(int i=0; i<arr.length;i++){
			if(arr[i] > 0){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
