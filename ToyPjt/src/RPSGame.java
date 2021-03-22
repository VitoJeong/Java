import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class RPSGame {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		int userNum = -1;
		int com = (int)(Math.random()*3);
		System.out.println("---------- 가위바위보 게임 ----------");
		System.out.println("가위(1), 바위(2), 보(3) 중에 어떤 것을 선택하시겠습니까?");
		try {
			input = br.readLine();
			switch (input.trim()) {
			case "찌":
			case "가위":
			case "1":
				userNum = 0;
				break;
			case "묵":
			case "바위":
			case "주먹":
			case "2":
				userNum = 1;
				break;
			case "빠":
			case "보":
			case "보자기":
			case "3":
				userNum = 2;
				break;
				
			default:
				throw new InvalidParameterException("형식에 맞지 않는 입력값입니다.");
			}
			StringBuilder sb = new StringBuilder();
			sb.append("결과 : ");
			sb.append(getResult(userNum, com));
			sb.append("\n");
			sb.append("[사용자] : ");
			sb.append(getResult(userNum));
			sb.append("\n");
			sb.append("[컴퓨터] : ");
			sb.append(getResult(com));
			sb.append("\n");
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static String getResult(int n){
		
		String str = null;
		
		switch (n) {
		case 0:
			str = "가위";
			break;
		case 1:
			str = "바위";
			break;
		case 2:
			str = "보";
			break;

		default:
			throw new InvalidParameterException("형식에 맞지 않는 입력값입니다.");
		}
		
		return str;
	}
	
	static String getResult(int user, int com){
		
		String str = null;
		
		if(user<0 || 2<user) throw new InvalidParameterException("형식에 맞지 않는 입력값입니다.");
		if(com<0 || 2<com) throw new InvalidParameterException("형식에 맞지 않는 입력값입니다.");

		if(user == com) return str = "비겼습니다.";
		if(user > com)
		{
			if(user == 2 && com == 0)
			{
				str = "졌습니다.";
			}
			else
			{
				str = "이겼습니다.";
			}
		}
		else
		{
			if(user == 0 && com == 2)
			{
				str = "이겼습니다.";
			}
			else
			{
				str = "졌습니다.";
			}
		}
		
			
	
		return str; 
	}
}
