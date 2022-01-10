import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++){
			List<Character> list = new LinkedList<>();
			ListIterator<Character> iterator = list.listIterator();
			String str = br.readLine();

			for(int i=0; i<str.length(); i++){
				char c = str.charAt(i);
				switch (c){
					case '<':
						if(iterator.hasPrevious()){
						iterator.previous();
						}
						break;

					case '>':
						if(iterator.hasNext()){
						iterator.next();
						}
						break;

					case '-':
						if(iterator.hasPrevious()) {
							iterator.previous();
							iterator.remove();
						}
						break;

					default:
						iterator.add(c);
				}
			}
			StringBuilder sb = new StringBuilder();

			for(char chr : list){
				sb.append(chr);
			}
			System.out.println(sb.toString());
		}
	}
}
