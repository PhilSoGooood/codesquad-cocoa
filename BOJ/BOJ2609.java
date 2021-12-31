import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main {
	public static int biggest(int x, int y) {
		if(x==0 || y==0) return 0;
		if (x > y) {
			while(true){
				int tmp = x % y;
				if(tmp==0){
					return y;
				} else {x=y; y = tmp;}
			}
		} else {
			while(true){
				int tmp = y % x;
				if(tmp==0){
					return x;
				} else {y =x ; x = tmp;}
			}
		}
	}

	public static int smallest(int x, int y) {
		if(biggest(x, y) == 0) return 0;
		else return x * y / biggest(x, y);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		bw.write(biggest(x, y) + "\n");
		bw.write(smallest(x, y)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}