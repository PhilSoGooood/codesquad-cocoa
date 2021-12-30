import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int total = 0;
		int max=-4000;
		int min=4000;
		for(int i=0; i<N; i++){
			int tmp = Integer.parseInt(br.readLine());
			arr[i] = tmp;
			total += tmp;
			if(tmp > max) max = tmp;
			if(tmp < min) min = tmp;
			if(map.containsKey(tmp)){
				map.put(tmp, map.get(tmp)+1);
			} else {
				map.put(tmp, 1);
			}
		}
		Arrays.sort(arr);
		bw.write(Math.round(total / (float)N) + "\n");
		bw.write(arr[N/2] + "\n");
		int mostValue = 0;
		ArrayList<Integer> mode = new ArrayList<>();
		for(int i=0; i<N; i++){
			if(map.get(arr[i]) > mostValue) mostValue = map.get(arr[i]);
		}
		for(int i=0; i<N; i++){
			if(map.get(arr[i]) == mostValue && !mode.contains(arr[i])) mode.add(arr[i]);
		}
		if(mode.size() > 1){
			bw.write(mode.get(1)+"\n");
		} else {
			bw.write(mode.get(0)+"\n");
		}
		bw.write(max-min + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}