import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void findHobbit(int[] hobbits, int total) throws  IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int nonHobbit1, nonHobbit2;
		loop:
		while(true){
			for(int i=0; i<8; i++){
				for(int j=i+1; j<9; j++){
					if(total - hobbits[i] - hobbits[j] == 100){
						nonHobbit1 = i;
						nonHobbit2 = j;
						break loop;
					}
				}
			}
		}
		for(int i=0; i<9; i++){
			if(i == nonHobbit1 || i == nonHobbit2) continue;
				bw.write(hobbits[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hobbits = new int[9];
		int total = 0;
		for(int i=0; i<9; i++){
			hobbits[i] = Integer.parseInt(br.readLine());
			total += hobbits[i];
		}
		Arrays.sort(hobbits);
		findHobbit(hobbits, total);
		br.close();
	}
}