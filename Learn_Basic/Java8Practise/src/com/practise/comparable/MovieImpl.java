package com.practise.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieImpl {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Abcd", 6.9, 1980));
		list.add(new Movie("Inception", 8.8, 2010));
		list.add(new Movie("The Godfather", 9.2, 1972));
		list.add(new Movie("The Dark Knight", 9.0, 2008));
		list.add(new Movie("Pulp Fiction", 8.9, 1994));
		list.add(new Movie("Schindler's List", 8.9, 1993));
		list.add(new Movie("The Lord of the Rings: The Return of the King", 8.9, 2003));
		list.add(new Movie("Fight Club", 8.8, 1999));
		list.add(new Movie("Forrest Gump", 8.8, 1994));
		list.add(new Movie("The Matrix", 8.7, 1999));
		Collections.sort(list);
		for(Movie  movie : list) {
			System.out.println(movie.toString());
		}

	}

}
