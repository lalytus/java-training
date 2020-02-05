package co.lalytus.java;

public class Runner {

	public static void main(String[] args) {
		String name = "Míchico";
		System.out.println("Hello " + name);
		int age = 5;
		System.out.println(name + " tiene " + age + " años");
		double weight = 9.0;
		System.out.println(name + " pesa " + weight + " Kg");
		if (weight >= 5) {
			System.out.println(name + " está gordo");
		}
		boolean castreated = false;
		if (castreated) {
			System.out.println("Cat childless");
		} else {
			System.out.println("Possible dad");
		}
		String kindFood = null;
		if (age > 10) {
			kindFood = "Pienso para gato senior";
		} else if (castreated) {
			kindFood = "Pienso para gato esterilizado";
		} else {
			kindFood = "Pienso normal";
		}
		System.out.println(name + " come " + kindFood);
		int lives = 3;
		System.out.println(name + " tiene " + lives + " vidas");
		if (weight >= 5 && kindFood.equals("Pienso normal")) {
			lives--;
			System.out.println(name + " tiene " + (lives) + " vidas");
		}

	}
}
