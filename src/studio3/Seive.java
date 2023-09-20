package studio3;

import java.util.Scanner;

public class Seive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();

		boolean [] bool = new boolean [n+2];
		bool[0] = true;
		bool[1] = true;
		bool[2] = false;
		bool[n] = true;
		for (int i = 2; i <= n; i++)
		{
			if (!bool[i]) {
				for (int j = 2; j <= n/i; j++) {
					bool[j*i] = true;
				}
				
			}
			continue;

		}
		for (int i = 2; i < n; i++)
			if (!bool[i]) {
				System.out.print(i+", ");
			}


	}

}
