package step4;

import java.util.Scanner;

public class N1110 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, d, e, i = 1;
		a = in.nextInt();
		e = a;
		while (true) {
			b = a / 10;
			c = a % 10;
			d = b + c;
			a = c * 10 + d % 10;

			if (a == e)
				break;
			else {
				i++;
			}
		}
		System.out.println(i);
	}
}