import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Baekjoon {

	static int v, e, d[];
	static boolean finished[], map[][];
	static Stack<Integer> stack;
	static Vector<Vector<Integer>> scc;
	
	public static void main(String[] args) throws Exception {
		// 1671
		// -> 이분매칭(DFS 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		d = new int[v+1];
		map = new boolean[v+1][v+1];
		finished = new boolean[v+1];
		stack = new Stack<>();
		scc = new Vector<>();
		
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			pushBack(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 1; i <= v; i++) {
			if(d[i] == 0) dfs(i);
		}

		System.out.println(scc.size());

		solve();
	}
	
	public static void pushBack(int a, int b){
		map[a][b] = true;
	}
	
	public static int dfs(int x){
		if(x==0) return x;
		d[x] = x;
		stack.push(x);
		
		int parent = d[x];
		for (int i = 1; i < map[x].length; i++) {
			
			if(map[x][i])
			{
				if(d[i]==0)	parent = Math.min(parent, dfs(i));
				else if(!finished[i]) parent = Math.min(parent, d[i]);
			}
		}
		System.out.println(parent);
		// 부모노드가 자신인 경우
		if(parent == d[x]) {
			
			Vector<Integer> vector = new Vector<>();
			while(!stack.isEmpty()){
				int t = stack.pop();
				vector.add(t);
				finished[t] = true;
				if(t == x) break;
			}
			scc.add(vector);
		}
		
		// 자신의 부모값을 반환
		return parent;
	}
	
	static void solve() throws Exception {
		for (int i = 1; i <= v; i++) {
			if(d[i] == 0) dfs(i);
		}
		
		for(int i = 0; i < scc.size(); i++){
			Collections.sort(scc.get(i));
		}
		
		Collections.sort(scc, new Comparator<Vector<Integer>>() {
			@Override
			public int compare(Vector<Integer> o1, Vector<Integer> o2) {
				return Integer.compare(o1.get(0), o2.get(0));
			}
		});
		
		for(int i=0; i<scc.size(); i++){
			scc.get(i).stream().forEach(el -> System.out.print(el+" "));
			System.out.println("-1");
		}
		
	}
	
}
