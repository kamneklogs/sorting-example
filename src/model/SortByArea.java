package model;

import java.util.Comparator;

public class SortByArea implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {

		if (o1.getArea() - o2.getArea() < 0) {
			return -1;
		} else if (o1.getArea() - o2.getArea() > 0) {
			return 1;
		} else if (o1.getPopulation() - o2.getPopulation() > 0) {
			return -1;
		} else if (o1.getPopulation() - o2.getPopulation() < 0) {
			return 1;
		}

		return 0;
	}

}
