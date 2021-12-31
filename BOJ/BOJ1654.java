import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		long[] arr = new long[K];
		for(int i=0; i<K; i++){
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		long start = 0;
		long end = arr[K-1]+1;
		long cnt;
		long mid = 0;
		while(start < end){
			mid = (start+end) / 2;
			cnt = 0;
			for(int i=0; i<arr.length; i++){
				cnt += (arr[i] / mid);
			}
			if(cnt < N) {end = mid;}
			else{start = mid + 1;}
		}
		bw.write(start-1+"");
		bw.flush();
		bw.close();
		br.close();
	}
}