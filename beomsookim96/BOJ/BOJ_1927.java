package BOJ_1927;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {// BOJ 1927 최소 힙
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input > 0) {
				pq.add(input);				
			}else {
				Object obj = pq.poll();
				if(obj == null) {
					sb.append("0\n");
				}else {
					sb.append(obj.toString());
					sb.append("\n");
				}
			}
		}
		bw.write(sb.toString());					
		bw.close();
		br.close();
		
	}
}
