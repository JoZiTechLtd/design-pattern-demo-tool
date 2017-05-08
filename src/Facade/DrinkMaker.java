package Facade;

public class DrinkMaker {
	
	private Drink beer;
	private Drink wine;
	private Drink coffee;
	private Drink tea;
	
	public DrinkMaker() {
		beer = new Beer();
		wine = new Wine();
		coffee = new Coffee();
		tea = new Tea();
	}
	
	public void getBeer() {
		beer.makeDrink();
	}
	
	public void getWine() {
		wine.makeDrink();
	}
	
	public void getCoffee() {
		coffee.makeDrink();
	}
	
	public void getTea() {
		tea.makeDrink();
	}
}
