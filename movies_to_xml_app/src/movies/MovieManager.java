package movies;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import movies.Movie.Genre;
import movies.Person.Gender;

public class MovieManager {

	public static void main(String args[]) {

		Person person1 = new Person("Keanu", "Reeves", Gender.MALE, false, false);
		Person person2 = new Person("Carrie-Anne", "Moss", Gender.FEMALE, false, false);
		Person person3 = new Person("Marion", "Cotillard", Gender.FEMALE, true, true);
		Person person4 = new Person("Leonardo", "Di Caprio", Gender.MALE, false, true);
		Person person5 = new Person("Kate", "Winslet", Gender.FEMALE, true, true);

		List<Person> castMovie1 = new ArrayList<Person>();
		castMovie1.add(person1);
		castMovie1.add(person2);

		List<Person> castMovie2 = new ArrayList<Person>();
		castMovie2.add(person3);
		castMovie2.add(person4);

		List<Person> castMovie3 = new ArrayList<Person>();
		castMovie3.add(person4);
		castMovie3.add(person5);

		Movie movie1 = new Movie("Matrix", Genre.SCI_FI, 140, 9.5, castMovie1);
		Movie movie2 = new Movie("Inception", Genre.ACTION, 160, 9.0, castMovie2);
		Movie movie3 = new Movie("Titanic", Genre.ROMANTIC, 200, 5.0, castMovie3);

		List<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(movie1);
		moviesList.add(movie2);
		moviesList.add(movie3);

		File newXMLFile = new File("C:/Users/VMate/Week_9A_task/new_movies.xml");

		try {
			FileWriter outputXMLFileWriter = new FileWriter(newXMLFile);
			outputXMLFileWriter.write("<movies>");
			for (Movie movie : moviesList) {
				outputXMLFileWriter.write(movie.toXMLString());
			}
			outputXMLFileWriter.write("</movies>");
			outputXMLFileWriter.flush();
			outputXMLFileWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("File has been created!");
		}

		System.out.println("This is how the XML File will look like:");
		System.out.println();
		System.out.println("<movies>");
		for (Movie movie : moviesList) {
			System.out.println(movie.toXMLString());
		}
		System.out.println("</movies>");
		System.out.println();
		System.out.println("Get a <HashMap> where the <Keys> are the actors");
		System.out.println("and the <Values> are the number of films they were starred in:");
		System.out.println();
		System.out.println("\t" + Tools.countMoviesPerPerson(moviesList).toString());
		System.out.println();
		System.out.println("Get movie titles in a <String Array>:");
		System.out.println();
		System.out.println("\t" + Arrays.toString(Tools.getMovieTitles(moviesList)));
		System.out.println();
	}
}
