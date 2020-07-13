package step1;

import java.util.Scanner;

public class No1000 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, sum = 0;

		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			sum = a + b;
		}
		System.out.println(sum);
	}
}
