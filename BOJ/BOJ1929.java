import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean [] Arr = new boolean [N+1];
		for(int i=M; i<N+1; i++){
			Arr[i] = true;
		}
		for(int i=2; i*i<N+1; i++){
			for(int j=i*i; j<N+1; j+=i){
				Arr[j] = false;
			}
		}
		Arr[0] = Arr[1] = false;
		for(int i=M; i< Arr.length; i++){
			if(Arr[i] == true){
				System.out.println(i);
			}
		}
		br.close();
		}
	}
