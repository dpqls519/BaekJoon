package step3;

import java.util.Scanner;

public class N2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		while (in.hasNext()) {
			a = in.nextInt();

			for (int i = 1; i < 10; i++) {
				System.out.println(a + " * " + i + " = " + a * i);
			}
		}
	}
}