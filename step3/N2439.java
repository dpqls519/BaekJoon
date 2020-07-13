package step3;

import java.util.Scanner;

public class N2439 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		while (in.hasNext()) {
			a = in.nextInt();
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= a; j++) {
					if (i + j >= a + 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}