package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int sum = 0;
			
		System.out.print( "숫자를 입력하세요: " );
		int inputNumber = scanner.nextInt();
			
		for(int i = 0; i <= inputNumber; i++){
			if(inputNumber%2 != 0 && i%2 != 0){
				sum = sum + i;
			} else if(inputNumber%2 == 0 && i%2 == 0){
					sum = sum + i;
			}
		}
			
		System.out.println("결과 값: " + sum);
		scanner.close();
	}
	
}
