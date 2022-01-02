import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int zero = 0;
	static int one = 0;
	public static int fibonacci(int n){
		if (n == 0){
			zero++;
			return 0;
		} else if(n==1){
			one++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			String n = br.readLine();
			if(n==null) break;
			int N = Integer.parseInt(n);
			int num = 0;
			for(int i=1; ; i++){
				num = num*10 + 1;
				num = num % N;
				if(num==0){
					bw.write(i+"\n");
					break;
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}