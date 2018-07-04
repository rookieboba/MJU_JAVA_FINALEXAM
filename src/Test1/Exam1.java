package Test1;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int n;
		System.out.print("3이상의 홀수 입력 :");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int input = n/2+1;
		
		for(int i = 1; i<=input; i++){
			for(int j = i; j<input;j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
