package model;

public class Country implements Comparable<Country> {

	private String name;
	private long population;
	private int area;

	public Country(String name, long population, int area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double populationDensity() {

		return population / area;

	}

	@Override
	public int compareTo(Country arg0) {
		if(arg0.populationDensity() - populationDensity() > 0) {
			return 1;
		} else if (arg0.populationDensity() - populationDensity() < 0) {
			return -1;
		}else if (arg0.getPopulation() - getPopulation() > 0) {
			return 1;
		} else if (arg0.getPopulation() - getPopulation() < 0) {
			return -1;
		}

		return 0;
	}

	public String toString1() {
		return name + " " + (int) populationDensity() + " " + population;
	}

	public String toString2() {
		return name + " " + area + " " + population;
	}

}
