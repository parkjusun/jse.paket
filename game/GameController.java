package com.jse.game;

import java.util.Random;


import java.util.Scanner;

import com.jse.game.Calculator;
import com.jse.game.Dice;
import com.jse.game.RPSGame;
import com.jse.member.Kaup;
import com.jse.member.Member;

public class GameController {
	public static void main(String[] args) {
		String result = null;
		
		Scanner scan = new Scanner(System.in);
		Member memeber = new Member();
		Calculator calculator = new Calculator();
		Dice dice = new Dice();
		
		while (true) {
			System.out.println("0.회원가입	 1.로그인	2.1~100까지의 합	3.프로그램을 종료합니다. 4. 주사위게임	5. 계산기	6.홀짝  8. Kaup 지수");
			int flag = scan.nextInt();
			switch (flag) {
			case 0:
				result = "회원가입을 시작합니다.\n";
				System.out.println(result);
				System.out.println("아이디 입력");
				String id =scan.next();
				memeber.setId(id);
				break;
			
				
			case 1:
				result = "로그인을 시작합니다.\n";
				System.out.println(result);
				
				System.out.println("아이디입력");
				String id2 = scan.next();
				String returnID =memeber.getId();
				System.out.println("로그인된 아이디");
				if (id2.equals(returnID)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			
			case 2:
				result = "1~100까지의 합입니다.\n";
				System.out.println(result);
				sum1to100();
				break;

			case 3:
				result = "프로그램을 종료합니다.\n";
				System.out.println(result);
				return;
				
			case 4:
				result = "주사위 게임을 시작합니다.\n";
				System.out.println(result);
				switchDice();
				break;
			
			case 5:
				result = "계산기를 시작합니다.\n";
				System.out.println(result);
				System.out.println("첫번째수 입력");
				int a = scan.nextInt();
				System.out.println("두번째수 입력");
				int b = scan.nextInt();
				calculator.setNum1(a);
				calculator.setNum2(b);
				int cresult = calculator.caculator();
				System.out.println("합 :"+cresult);
				
				break;
			case 6:
				result = "주사위 (홀/짝) 게임을 시작합니다.\n";
				System.out.println(result);
				String diceRsult = scan.next();
				
				// 내 홀짝
				dice.setUser(diceRsult);
				String userString = dice.getUser();
				System.out.println("USER :"+userString);
				
				
				// 컴퓨터 홀짝
				Random ran1 = new Random();
				int randomDice = ran1.nextInt(6);
				System.out.println("PC 숫자: "+randomDice);
				dice.setpc(randomDice);
				String pcString1 = dice.getpc();
				System.out.println("PC: "+pcString1);
				
				// 결과
				String diceResultString = dice.dice();
				System.out.println("Result : "+diceResultString);
				break;
				
			case 7:
				System.out.println("가위1 | 바위2 | 보3을 입력하세요.");
				RPSGame rpsRool = new RPSGame();
				
				// 유저 데이터 읽어오기
				int user = scan.nextInt();
				rpsRool.setUserValue(user);
				String userResult = rpsRool.getUserValue();
				System.out.println("USER :"+userResult);
				
				// 컴퓨터 데이터 가져오기
				Random ran = new Random();
				int pc = ran.nextInt(3)+1;
				rpsRool.setPcValue(pc);
				String pcResult = rpsRool.getPcValue();
				System.out.println("PC :"+pcResult);
				
				// 결과 가져오기
				String rbsResult = rpsRool.rpsGame();
				System.out.println("Result :"+rbsResult);
				
				break;
				
			case 8:
				Kaup kaup = new Kaup();
				
				//몸무게 입력
				System.out.println("몸무게 입력 : " );
				kaup.setWeight(scan.nextDouble());
				
				//키 입력
				System.out.println("키 입력 : " );
				kaup.setStatur(scan.nextDouble());
				
				
				
				System.out.println("kaup지수 : " +  kaup.kapuResult());
				
				
				break;
				
			default:
				result = "0~2까지만 입력해주세요.\n";
				System.out.println(result);
				
				break;
			}

		}

	}
	

	static void switchDice(){
		int dice; // 이것은 컴퓨터가 출력한 숫자 저장
		String expect; // 사용자가 입력한 (홀/짝)저장
		String result = null;// 이것은 컴퓨터가 돌린 수의 (홀/짝)
		String result2 = "틀림";// 이것은 (맞음/틀림)을 보여줄꺼임
		
		System.out.println("주사위게임");
		System.out.println("기대하는 홀/짝값을 입력하세요.");
		
		// 사용자 데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		expect = scan.next();
		System.out.println(String.format("사용자 홀/짝 예상값: %s", expect));
		
		//컴퓨터 랜덤 숫자(주사위) 출력 (1~6)
		Random ran = new Random();
		dice = ran.nextInt(6)-1;
		System.out.println(String.format("컴퓨터 홀/짝 결과값: %d", dice));
		
		// 컴퓨터 홀짝 구하기
		switch (dice%2) {
		case 0:
			result = "짝";
			break;
		case 1:
			result = "홀";
		default:
			break;
		}
		System.out.println(String.format("결과 : %s", result));
		
		// 사용자가 입력한 데이터와 컴퓨터가 생성하여 홀짝으로 구분한 데이터가 일치되는지 확인 결과 출력
		if (expect.equals(result)) {
			result2 = "맞음";
		}
		
		System.out.println(result2);
	}
	
	static void gbagame() {
		//시나리오
		String userResult = null;
		String pcResult = null;
		int pc = 0;
		int user = 0;
		
		System.out.println("가위1 | 바위2 | 보3을 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		user = scan.nextInt();
		switch (user) {
		case 1:
			userResult = "가위";
			break;
		case 2:
			userResult = "바위";
			break;
		case 3:
			userResult = "보";
			break;

		default:
			userResult = "실격";
			break;
		}
		System.out.println("사용자의 값은"+userResult+" 입니다.");
		
		Random ran = new Random();
		pc = ran.nextInt(3)+1;
		switch (pc) {
		case 1:
			pcResult = "가위";
			break;
		case 2:
			pcResult = "바위";
			break;
		case 3:
			pcResult = "보";
			break;
		default:
			pcResult = "실격";
			break;
		}
		System.out.println("컴퓨터의 값은"+ pcResult +"입니다.");
		
		
		if((user == 1 && pc == 3)||(user == 2 && pc == 1)||(user == 3 && pc == 2) ) {
			System.out.println("유저의 승리");
		}else if((user == 1 && pc == 1)||(user == 2 && pc == 2)||(user == 3 && pc == 3) ){
			System.out.println("무승부");
		}else if(user >= 4){
			System.out.println("컴퓨터의 승리(실격)");
		}else		{
			System.out.println("컴퓨터의 승리");
		}
		
		
	}
	static void sum1to100() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum +=i;
		}
		
		System.out.println("합 : "+sum);
	}
}
