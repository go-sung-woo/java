
public class IfTest03 {

	public static void main(String[] args) {
		// ���ǹ� - if
		int score = 79;
		
		if(score >=90) {
			System.out.println("������ 90�� ���� Ů�ϴ�");
			System.out.println("����� A�Դϴ�");
		} else if(score >=80){
			System.out.println("������ 80�� ���� Ů�ϴ�");
			System.out.println("����� B�Դϴ�");
		} else if(score >=70){
			System.out.println("������ 70�� ���� Ů�ϴ�");
			System.out.println("����� C�Դϴ�");
		} else if(score >=60){
			System.out.println("������ 60�� ���� Ů�ϴ�");
			System.out.println("����� D�Դϴ�");
		} else {
			System.out.println("������ 60�� ���� �۽��ϴ�");
			System.out.println("����� F�Դϴ�");
		}
	}

}