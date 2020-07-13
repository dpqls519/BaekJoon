package step3;

import java.util.Scanner;

public class N2742 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		while (in.hasNext()) {
			a = in.nextInt();
			int b = a;
			for (int i = 1; i <= a; i++) {
				System.out.println(b);
				b--;
			}
		}
	}
}