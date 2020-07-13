package step1;

import java.util.Scanner;

public class No10430 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			sum1 = (a + b) % c;
			sum2 = (a % c + b % c) % c;
			sum3 = (a * b) % c;
			sum4 = (a % c * b % c) % c;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}
}
