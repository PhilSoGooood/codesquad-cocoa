import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			int card = Integer.parseInt(st.nextToken());
			if(!map.containsKey(card)){
				map.put(card, 1);
			} else {
				map.put(card, map.get(card)+1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++){
			int tmp = Integer.parseInt(st.nextToken());
			if(map.containsKey(tmp)){
				bw.write(map.get(tmp)+" ");
			} else{
				bw.write(0+" ");

			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}