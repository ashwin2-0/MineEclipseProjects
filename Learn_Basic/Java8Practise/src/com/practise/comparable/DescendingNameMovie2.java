package com.practise.comparable;

import java.util.Comparator;

public class DescendingNameMovie2 implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m2.getName().compareTo(m1.getName());
	}

}
