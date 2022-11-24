package baekjoon;

import java.util.Scanner;

public class No25304 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		int total = 0;
		for(int i=1; i<=N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			total += a * b;
		}
		
		System.out.println(X == total ? "Yes" : "No");
	}

}
