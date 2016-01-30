package movies;

import java.util.HashMap;
import java.util.List;

public class Tools {

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> newMovieList) {

		HashMap<Person, Integer> moviesPerPerson = new HashMap<Person, Integer>();

		for (int movieCounter = 0; movieCounter < newMovieList.size(); movieCounter++) {

			Movie currentMovie = newMovieList.get(movieCounter);

			for (int castCounter = 0; castCounter < currentMovie.cast.size(); castCounter++) {

				Person currentPerson = currentMovie.cast.get(castCounter);

				moviesPerPerson.put(currentPerson, 0);

			}

		}

		for (Person person : moviesPerPerson.keySet()) {

			int quantityOfMovies = 0;

			for (int movieCounter = 0; movieCounter < newMovieList.size(); movieCounter++) {

				Movie currentMovie = newMovieList.get(movieCounter);

				for (int castCounter = 0; castCounter < currentMovie.cast.size(); castCounter++) {

					Person currentPerson = currentMovie.cast.get(castCounter);

					if (person == currentPerson) {

						moviesPerPerson.replace(person, ++quantityOfMovies);

					}
				}
			}
		}

		return moviesPerPerson;
	}

	public static String[] getMovieTitles(List<Movie> newMovieList) {

		String[] movieTitles = new String[newMovieList.size()];

		for (int counter = 0; counter < newMovieList.size(); counter++) {

			movieTitles[counter] = newMovieList.get(counter).title;

		}

		return movieTitles;
	}

	public static String toXMLTag(String tagName, String value) {

		String xmlString;

		xmlString = String.format("<%s>%s</%s>", tagName, value, tagName);

		return xmlString;

	}

}
