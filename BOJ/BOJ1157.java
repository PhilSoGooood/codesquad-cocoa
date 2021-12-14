import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	static char check(String input) {
		int max = 0;
		int cnt = 0;
		char result = ' ';
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i< input.length(); i++){
			set.add(input.charAt(i));
		}
		Iterator<Character> iter = set.iterator();
		HashMap <Character, Integer> map = new HashMap<>();
		while(iter.hasNext()){
			map.put(iter.next(), 0);
		}
		for(int i=0; i< input.length(); i++){
			map.put(input.charAt(i), map.get(input.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > max) {
				max = e.getValue();
				result = e.getKey();
			}
		}
		for(Map.Entry<Character, Integer> e : map.entrySet()){
			if(e.getValue() == max){
				cnt++;
			}
		}
		if(cnt == 1){
			return result;
		}else {return '?';}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		char answer = check(input);
		System.out.println(answer);
		br.close();
	}
}


