package _05_netflix;

public class netflix_runner {
public static void main(String[] args) {
	Movie movie1 = new Movie("Avengers", 4);
	Movie movie2 = new Movie("Star Wars", 5);
	Movie movie3 = new Movie("Joker", 3);
	Movie movie4 = new Movie("Wonder Woman", 4);
	Movie movie5 = new Movie("Dune", 4);
	movie1.getTicketPrice();
	movie2.getTicketPrice();
	movie3.getTicketPrice();
	movie4.getTicketPrice();
	movie5.getTicketPrice();
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(movie1);
	queue.addMovie(movie2);
	queue.addMovie(movie3);
	queue.addMovie(movie4);
	queue.addMovie(movie5);
	System.out.println();
	queue.sortMoviesByRating();
	Movie bestmovie = queue.getBestMovie();
	Movie bestmovie2 = queue.getMovie(2);
	System.out.println("The best movie is "+bestmovie);
	System.out.println("The 2nd best movie is "+bestmovie2);
}
}
