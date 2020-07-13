package step1;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();

			sum1 = (a * ((b % 100) % 10));
			sum2 = (a * ((b % 100) / 10));
			sum3 = (a * (b / 100));
			sum4 = sum1 + sum2 * 10 + sum3 * 100;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}
}