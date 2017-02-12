package com.wintal.rookie.rank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProblemThree {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		LinkedList<Character> map = new LinkedList<>();

		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			map.add('h');
			map.add('a');
			map.add('c');
			map.add('k');
			map.add('e');
			map.add('r');
			map.add('r');
			map.add('a');
			map.add('n');
			map.add('k');

			for (int i = 0; i < s.length(); i++) {
				map.remove((Character) s.charAt(i));
				if (map.isEmpty()) {
					System.out.println("YES");
					break;
				}

			}
			if (!map.isEmpty()) {
				System.out.println("NO");
			}
			map.clear();
		}
	}
}
