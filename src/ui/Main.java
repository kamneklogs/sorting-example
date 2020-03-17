package ui;

import java.util.*;

import model.Country;
import model.SortByArea;

public class Main {

	public static void main(String[] args) {

		ArrayList<Country> c = new ArrayList<Country>();

		Scanner r = new Scanner(System.in);

		int opt = r.nextInt();
		r.nextLine();

		String s;

		for (int i = 0; i < opt; i++) {
			s = r.nextLine();
			String[] ss = s.split(";");
			c.add(new Country(ss[0], Long.parseLong(ss[1]), Integer.parseInt(ss[2])));
		}

		Collections.sort(c);

		for (Country cs : c) {
			System.out.println(cs.toString1());
		}

		System.out.println("----------");

		Collections.sort(c, new SortByArea());

		for (Country cs : c) {
			System.out.println(cs.toString2());
		}

		System.out.println("----------");

		Collections.reverse(c);

		for (Country cs : c) {
			System.out.println(cs.toString2());
		}
	}

}
