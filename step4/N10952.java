package step4;

import java.util.Scanner;

public class N10952 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		while (true) {
			a = in.nextInt();
			b = in.nextInt();
			if (a == 0 && b == 0)
				break;
			System.out.println(a + b);
		}

	}
}