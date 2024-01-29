package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		int last = 0;
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
				case "push" :
					last = Integer.parseInt(st.nextToken());
					stack.push(last);
					break;
				case "top" : 
					if(stack.empty()) 
						sb.append(-1).append('\n');
					else 
						sb.append(stack.peek()).append('\n');
					break;
				case "size" :
					sb.append(stack.size()).append('\n');
					break;
				case "empty" :
					if(stack.empty()) 
						sb.append(1).append('\n');
					else 
						sb.append(0).append('\n');
					break;
				case "pop" :
					if(stack.empty()) 
						sb.append(-1).append('\n');
					else 
						sb.append(stack.pop()).append('\n');				
					break;
			}
			
		}
		System.out.println(sb);
	}
}
