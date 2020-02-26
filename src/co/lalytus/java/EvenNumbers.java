package co.lalytus.java;

import java.util.ArrayList;

public class EvenNumbers {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		for (int i = 0; i < 200; i = i + 2) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		ArrayList numbers2 = new ArrayList();
		for (int i = 0; i < 100; i++) {
			numbers2.add(i * 2);
		}
		System.out.println(numbers2);
	}
}
