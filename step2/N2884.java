package step2;

import java.util.Scanner;

public class N2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			if (b >= 45) {
				b = b - 45;
				System.out.println(a + " " + b);
			} else {
				b = 60 + b - 45;
				if (a != 0) {
					a = a - 1;
					System.out.println(a + " " + b);
				} else if (a == 0) {
					a = 23;
					System.out.println(a + " " + b);
				}
			}
		}
	}
}