import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
        
        int[] array = new int[len];
       
        for(int i=0;i<len;i++){
        	array[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0;i<len;i++){
        	System.out.println(array[i]);
        }
        quickSort(array, 0, len-1);
        System.out.println("after");
        for(int i=0;i<len;i++){
        	System.out.println(array[i]);
        }
        
    }
    
    public static void quickSort(int[] arr, int start, int end){
    	if(start>=end) return;
    	
    	int key = start;
    	int i = start+1;
    	int j = end;
    	int temp;
    	
    	while(i<=j){
    		while(i<=end && arr[i] <= arr[key]) {
    			i++;
    		}
    		while(arr[j] >= arr[key] && j>start){
    			j--;
    		}

    		// 엇갈렸다면
    		if(i>j){ 
    			temp = arr[j];
    			arr[j] = arr[key];
    			arr[key] = temp;
    		} 
    		// 엇갈리지 않았다면
    		else {
    			temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    		}
    	}
    	
    	quickSort(arr, start, j-1);
    	quickSort(arr, j+1, end);
    	
    	// 퀵정렬로 시간초과남 
    	//  -> heap이나 merge로 풀어볼것
    }
}