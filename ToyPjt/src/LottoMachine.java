import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoMachine {
	
	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최근 5회중 3회 이상 나온 번호를 입력해주세요 >> ");
		
		int num1 = 0;
		String temp = br.readLine();
		
		if(!temp.equals("") && temp!=null) num1 = Integer.parseInt(temp);
		
		List<Byte> result = new ArrayList<>();
		
		byte[] numbers = new byte[45];
		for(byte i=0;i<numbers.length;i++){
			numbers[i] = (byte) (i+1);
		}
		
		while(result.size()<7){
			byte ball = (byte) (Math.random() * 45 + 1);
			if(!result.contains(ball) && ball != num1) {result.add(ball);}
			else {
				System.out.println("중복>,.<");
			}
		}
		
		result.sort(null);
		System.out.println("로또번호 추첨 고고링 !!");
		for(byte i=0;i<result.size();i++){
			try {
				Thread.sleep(1);
				if(!(i==result.size()-1)){
					
					System.out.println(i+1 + "번 번호 : " + result.get(i));
				}
				else {
					
					System.out.println("보너스! :" + result.get(i));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // main() 
	
}
