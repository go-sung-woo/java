
public class IfTest03 {

	public static void main(String[] args) {
		// 조건문 - if
		int score = 79;
		
		if(score >=90) {
			System.out.println("점수가 90점 보다 큽니다");
			System.out.println("등급이 A입니다");
		} else if(score >=80){
			System.out.println("점수가 80점 보다 큽니다");
			System.out.println("등급이 B입니다");
		} else if(score >=70){
			System.out.println("점수가 70점 보다 큽니다");
			System.out.println("등급이 C입니다");
		} else if(score >=60){
			System.out.println("점수가 60점 보다 큽니다");
			System.out.println("등급이 D입니다");
		} else {
			System.out.println("점수가 60점 보다 작습니다");
			System.out.println("등급이 F입니다"); 
		}
	}

}
