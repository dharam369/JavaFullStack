package com.techlabs.facade.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class MovieManager {
	private List<Movie> movies;
	static final String filepath="E:\\Full Stack Java\\Assignment\\17-structuraldesignpattern-app\\src\\com\\techlabs\\facade\\serializationdeserialization\\movieinput.txt";
	
	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();
	}
	
	private void loadMovies() {
		try {
			FileInputStream file=new FileInputStream(filepath);
			ObjectInputStream in=new ObjectInputStream(file);
			
			movies=(List<Movie>) in.readObject();
		}
		catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }	
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public void clearMovies() {
		movies.clear();
	}
	
	public List<Movie> getMovies(){
		return movies;
	}
	
	public int getMovieId() {
		return movies.size()+1;
	}
	
	public void saveMovie() {
		try {
			FileOutputStream file=new FileOutputStream(filepath);
			ObjectOutputStream out= new ObjectOutputStream(file); 
			out.writeObject(movies);
			
			file.close();
			out.close();
		}
		catch (IOException ex)
        {
            System.out.println("IOException is caught");
        }
	}
	
	public void deleteAllMovies() {
		movies.clear();
		saveMovie();
	}
}
