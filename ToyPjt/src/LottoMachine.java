import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoMachine {
	
	public static void main(String[]args) throws IOException{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("========최근 5회의 당첨 번호를 입력해주세요=========");
//		
//		List<Numbers> list = new ArrayList<Numbers>();
//
//		for(int i=0;i<5;i++){
//			
//			Numbers numbers = new Numbers();
//			System.out.println("지난"+ (i+1)+"회의 당첨 번호를 입력해주세요");
//			numbers.setNum1(Byte.parseByte(br.readLine()));
//			numbers.setNum2(Byte.parseByte(br.readLine()));
//			numbers.setNum3(Byte.parseByte(br.readLine()));
//			numbers.setNum4(Byte.parseByte(br.readLine()));
//			numbers.setNum5(Byte.parseByte(br.readLine()));
//			numbers.setNum6(Byte.parseByte(br.readLine()));
//			System.out.print("보너스를 입력해주세요! >>>");
//			numbers.setBonus(Byte.parseByte(br.readLine()));
//			
//			list.add(numbers);
//			System.out.println("최근 "+ i+"회의 당첨번호가 저장되었습니다.");
//		}
		
		List<Byte> result = new ArrayList<>();
		
		byte[] numbers = new byte[45];
		for(byte i=0;i<numbers.length;i++){
			numbers[i] = (byte) (i+1);
		}
		
//		for(byte i=0;i<numbers.length;i++){
//			System.out.print(numbers[i]+" ");
//		}
		
		for(byte i=0;i<7;i++){
			byte ball = (byte) (Math.random() * 45 + 1);
			if(checkDuplicated(result, ball)!=0) result.add(ball);
		}
		System.out.println("로또번호 추첨 고고링 !!");
		for(byte i=0;i<result.size();i++){
			try {
				Thread.sleep(1);
				if(!(i==result.size()-1)){
					
					System.out.println(i+1 + "번 번호" + result.get(i));
				}
				else {
					
					System.out.println("보너스 번호" + result.get(i));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static byte checkDuplicated(List<Byte> list, byte n){
		byte result = 0;
		if(list.contains(n)) {
			byte ball = (byte) (Math.random() * 45 + 1);
			result = checkDuplicated(list, ball);
		}
		else{
			result = n;
		}
		return result;
	}
}
