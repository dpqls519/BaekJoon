package step1;

import java.util.Scanner;

public class No1008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, sum = 0;
		while (in.hasNext()) {
			a = in.nextDouble();
			b = in.nextDouble();
			sum = a / b;
		}
		System.out.printf("%.9f", sum);
	}
}
