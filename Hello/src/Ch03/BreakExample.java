package Ch03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while (true) {
			System.out.print(">> ");
			String text = s.nextLine();
			
			if (text.equals("exit")) // text type: String (참조형) > equals() 
				break;
		}
		
		System.out.println("종료합니다.");
		
		s.close();
	}

}
