import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<String> list = new LinkedList<>();
		String input = br.readLine();

		int current = input.length();

		for(int i=0; i<input.length(); i++){
			list.add(Character.toString(input.charAt(i)));
		}
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()){
			iterator.next();
		}
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			String[] command = br.readLine().split(" ");
			if(command[0].equals("L")){
				if(iterator.hasPrevious()){
					iterator.previous();
				}
			} else if(command[0].equals("P")){
				iterator.add(command[1]);
			} else if(command[0].equals("D")){
				if(iterator.hasNext())
					iterator.next();
			} else if(command[0].equals("B")){
				if(iterator.hasPrevious()){
					iterator.previous();
					iterator.remove();
				}
			}
		}
		for(String str : list){
			bw.write(str);
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static void main(String[] args) throws IOException {
		solution();
	}
}