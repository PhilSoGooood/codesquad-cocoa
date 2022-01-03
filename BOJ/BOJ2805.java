import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] trees = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			trees[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(trees);
		long low = 0;
		long high = trees[N-1]+1;
		long mid = 0;
		while(low < high){
			long total = 0;
			mid = (low+high) / 2;
			for(int height : trees){
				if(height > mid) total += (height-mid);
			}

			if(total < M){high = mid;}
			else{low = mid + 1;}
		}
		bw.write(low-1+"");

		bw.flush();
		bw.close();
		br.close();
	}
}