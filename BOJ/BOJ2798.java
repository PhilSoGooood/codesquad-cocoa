import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int blackJack(int[] arr, int M) {
		int result = 0;
		Arrays.sort(arr);
		game:
		for(int i= arr.length-1; i>1; i--){
			for(int j = i-1; j>0; j--){
				for(int k = j-1; k>=0; k--){
					int tmp = arr[i] + arr[j] + arr[k];
					if(result < tmp && tmp <= M){
						result = tmp;
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] numbers = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<numbers.length; i++){
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(blackJack(numbers, M));
		br.close();
	}
}
