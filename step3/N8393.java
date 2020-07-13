package step3;

import java.util.Scanner;

public class N8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b = 0;
		while (in.hasNext()) {
			a = in.nextInt();
			
			for (int i = 1; i <= a; i++) {
				b = b + i;
			}
			
			System.out.println(b);
		}
	}
}