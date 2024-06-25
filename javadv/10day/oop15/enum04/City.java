package oop15.enum04;

public enum City {
	SEOUL(200), BUSAN(100), JEJU(50);
	
	int population;
	
	private City(int population) {
		this.population = population;
	}
	
	public int getPopulation() {
		return population;
	}
}
