package step2;

import java.util.Scanner;

public class N1330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		while (in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			if (a > b)
				System.out.println(">");
			else if (a < b)
				System.out.println("<");
			else
				System.out.println("==");
		}
	}
}