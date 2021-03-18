import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 2252 줄세우기
		// -> 위상정렬 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		// 학생수의 차수
		int inDegree[] = new int[n];
		ArrayList<Integer> adj[] = new ArrayList[n];
		
		for (int i = 0; i < inDegree.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int y = Integer.parseInt(st.nextToken())-1;
			int x = Integer.parseInt(st.nextToken())-1;
			adj[y].add(x);
			inDegree[x]++;
		}
		
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 0; i < adj.length; i++) {
			if(inDegree[i] == 0){
				q.offer(i);
				inDegree[i]--;
			}
		}
		
		while(!q.isEmpty()){
			int x = q.poll();
			System.out.print((x+1)+" ");
			for(int i=0;i<adj[x].size();i++){
				int ne = adj[x].get(i);
				inDegree[ne]--;
				if(inDegree[ne]==0){
					q.offer(ne);
				}
			}
		}
		
	}


}
