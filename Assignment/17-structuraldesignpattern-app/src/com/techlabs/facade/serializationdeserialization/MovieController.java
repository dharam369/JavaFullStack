package com.techlabs.facade.serializationdeserialization;

import java.util.Scanner;

public class MovieController {
	private MovieManager manager;

	public MovieController(MovieManager manager) {
		super();
		this.manager = manager;
	}
	public void start() {
		displayMenu();
	}
	private void displayMenu() {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("======== Movie Store Menu =========");
			System.out.println("1. Add Movie");
			System.out.println("2. Show All Movies");
			System.out.println("3. Clear Movies");
			System.out.println("4. Get Movie Id");
			System.out.println("5. Delete All Movies");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				Movie newMovie = setMovieDetails();
				manager.addMovie(newMovie);
				manager.saveMovie();
				System.out.println("Movie Added Successfully");
				break;
			case 2:
				showAllMovies();
				break;
			case 3: 
				manager.clearMovies();
				System.out.println("All  movies are cleared successfully");
				break;
			case 4:
				System.out.println("Current Movie id is :"+manager.getMovieId());
				break;
			case 5:
				manager.deleteAllMovies();
				System.out.println("All movies deleted successfully");
				break;
			case 6:
				System.out.println("Exiting.....");
				return;
			default:
				System.out.println("Invalid Choice. Please Enter a valid option.\n");
				
			}
			
		}
		
	}
	private void showAllMovies() {
		if(manager.getMovies().size()==0)
		{
			System.out.println("Empty List of Movies\n");
			return;
		}
		for(Movie movie:manager.getMovies()) {
			System.out.printf("%-14s %-32s %-8s %s%n",movie.getId(),"'"+movie.getName(),"'"+movie.getYear(),"'"+movie.getGenre());
		}
	}
	
	private Movie setMovieDetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Movie Details as (ID, Name, Year, Genre) respectively");
				int id=scanner.nextInt();
				String name=scanner.next();
				int year=scanner.nextInt();
				String genre=scanner.next();
				return new Movie(id,name,year,genre);
	}
}
