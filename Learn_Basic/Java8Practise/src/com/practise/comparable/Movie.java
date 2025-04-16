package com.practise.comparable;

public class Movie implements Comparable<Movie> {
	private String name; // Movie Name
	private double rating; // Movie Rating
	private int year;

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int compareTo(Movie m) {
		//  return Integer.compare(this.year, m.year);  OR
		return this.year-m.year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
	

}

