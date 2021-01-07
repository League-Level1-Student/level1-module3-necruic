package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World earth  = new World();
	Bug ant = new Bug();
	Bug beetle = new Bug(Color.BLUE);
	Random rand = new Random();
	int randnum = rand.nextInt(10);
	int randnum2 = rand.nextInt(10);
	for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		Flower flower = new Flower();
		Location flowerand = new Location(i, j);
		earth.add(flowerand, flower);
	}
	}
	beetle.turn();
	beetle.turn();
	Location random = new Location(randnum, randnum2);
	Location sandiego = new Location(4, 5);
	earth.add(sandiego, ant);
	earth.add(random, beetle);	
	earth.show();
}
}
