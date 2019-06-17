package exercises;

import java.util.ArrayList;
import java.util.List;

public class Plane {
	
	public void addSnakes(List<Snake> snakes) {
		SnakeFactory.getSnakes();
	}

	public int getNumberOfVenomousSnakes() {

		List<Snake> venomousSnake = new ArrayList<Snake>();
		List<Snake> nonVenomousSnake = new ArrayList<Snake>();

		for (Snake snake : SnakeFactory.getSnakes()) {
			if (snake.isVenomous()) {
				venomousSnake.add(snake);
			} else {
				nonVenomousSnake.add(snake);
			}
		}

		System.out.println("Venomous snakes: " + venomousSnake.size());
		System.out.println("Snakes that ain't dangerous: " + nonVenomousSnake.size());
		return venomousSnake.size();
	}

	
}
