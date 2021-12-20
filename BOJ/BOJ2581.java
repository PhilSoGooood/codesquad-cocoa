import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[N+1];
		for(int i=0; i<M; i++) arr[i] = false;
		for(int i=M; i< arr.length; i++) arr[i] = true;
		for(int i=2; i*i < arr.length; i++){
			for(int j=i*i; j< arr.length; j+=i){
				arr[j] = false;
			}
		}
		arr[1] = arr[0] = false;
		int result = 0;
		int minNum = N;
		for(int i=M; i< arr.length; i++){
			if(arr[i] == true){
				result += i;
				if(minNum > i) minNum = i;
			}
		}
		if(result == 0){
			System.out.println(-1);
		}else {
			System.out.println(result);
			System.out.println(minNum);
		}
		br.close();
	}
}
