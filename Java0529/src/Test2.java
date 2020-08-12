import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		/*// 스캐너 사용해서 5개의 실수 데이터 입력
		// 백터 객체에 저장
		// => 모든 요소의 값 확인(확장된 for문)
        Vector<Double> num = new Vector<Double>();
        
        for(int i=0;i<5;i++){
        	num.add(scan.nextDouble());
        }
        //System.out.println(num);
        System.out.print("[");
        for(double d : num ){
        	System.out.print(d+" ");
        }
        System.out.print("]");
		
		// 저장된 값중에서 가장 큰값을 찾아서 출력	
        double max = num.get(0);
        for(int i=1;i<num.size();i++){
        	if(max < num.get(i)){
        		max = num.get(i);
        	}
        }
        
        System.out.println("최대값 : "+max);*/
        
        ///////////////////////////////////////////////////////////
        // 학점 관리 프로그램 생성
        // 사용자로부터 학점('A','B','C','D','F')5개의 종류를 입력 가능하다
        // 5과목의 학점을 입력 ArrayList에 저장
        // => A-4.0,B-3.0,C-2.0,D-1.0,F-0.0
        // => 이때 패스 기준 : 15점 이상 패스 ,14~7점 보충수업, 6~0 재수강
        // ex) >> A B B C F (입력)
        //     >> 학점의 총합 : 00/20.0 점 , 패스/보충수업/재수강
        
        ArrayList<String> score = new ArrayList<String>();
        System.out.println("사용자 학점 5개를 입력하시오 > ");
        int total = 0;
        for(int i=0;i<5;i++){
        	String str = scan.next();
        	score.add(str);
        	
        	switch(str){
        	  case "A":
        	  case "a":
        		  System.out.println("4.0  ");
        		  total += 4.0;
        		  break;
        	  case "B":
        	  case "b":
        		  System.out.println("3.0  ");
        		  total += 3.0;
        		  break;
        	  case "C":
        	  case "c":
        		  System.out.println("2.0  ");
        		  total += 2.0;
        		  break;
        		  
        	  case "D":
        	  case "d":
        		  System.out.println("1.0  ");
        		  total += 1.0;
        		  break;
        	  case "F":
        	  case "f":
        		  System.out.println("0.0  ");
        		  total += 0.0;
        		  break;
        		  
        	}
        	System.out.println(" 학점 계산 완료 ! ");
        	
        }
        System.out.println("입력된 학점 : "+score);
        System.out.println("총 학점 : "+total);
        
       // => 이때 패스 기준 : 15점 이상 패스 ,14~7점 보충수업, 6~0 재수강
        if(15<=total && total<=20){
        	System.out.println(" 패스 ! ");
        }else if(7<=total && total <=14){
        	System.out.println(" 보충 수업 ");
        }else if(0 <=total && total <=6){
        	System.out.println(" 재 수 강 ");
        }else{
            System.out.println(" 에러 발생! 관리자에게 문의 하세요. ");
        }
        
		

	}

}
