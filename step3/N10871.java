package step3;

import java.util.Scanner;

public class N10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int data[] = new int[n];

		for (int a = 0; a < data.length; a++) {
			data[a] = sc.nextInt();
		}

		for (int b = 0; b < data.length; b++) {

			if (data[b] < min) {
				System.out.print(data[b] + " ");
			}
		}
		sc.close();
	}
}