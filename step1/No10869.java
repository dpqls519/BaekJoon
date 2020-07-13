package step1;

import java.util.Scanner;

public class No10869 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			sum1 = a + b;
			sum2 = a - b;
			sum3 = a * b;
			sum4 = a / b;
			sum5 = a % b;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
	}
}
