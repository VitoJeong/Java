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
		// 1516 게임개발
		// -> 위상정렬 사용(임계변수 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
	
		// 차수
		int inDegree[] = new int[n];
		ArrayList<Integer> adj[] = new ArrayList[n];
		int value[] = new int[n]; // 최소시간을 저장
		int result[] = new int[n];
		for (int i = 0; i < inDegree.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			value[i]=x;
			while(true){
				x = Integer.parseInt(st.nextToken())-1;
				if(x==-2)break;
				inDegree[i]++;
				adj[x].add(i);
			}
		}
		
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 0; i < adj.length; i++) {
			if(inDegree[i] == 0){
				q.offer(i);
				result[i] = value[i];
				inDegree[i]--;
			}
		}
		
		while(!q.isEmpty()){
			int x = q.poll();
			for(int i=0;i<adj[x].size();i++){
				int ne = adj[x].get(i);
				result[ne] = Math.max(result[ne], result[x] + value[ne]); 
				inDegree[ne]--;
				if(inDegree[ne]==0){
					q.offer(ne);
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); 
		}
	}


}
