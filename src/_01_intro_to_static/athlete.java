package _01_intro_to_static;

public class athlete {
	    static int nextBibNumber = 1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = nextBibNumber;
	        this.nextBibNumber++;
	    }
}
