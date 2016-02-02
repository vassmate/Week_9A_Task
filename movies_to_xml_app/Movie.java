package movies;

import java.util.List;

public class Movie {

	enum Genre {
		ACTION, THRILLER, HORROR, SCI_FI, ROMANTIC, COMEDY, DRAMA
	}

	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast;

	public Movie(String title, Genre genre, long duration, double rate, List<Person> cast) {
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;

	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre newGenre) {
		this.genre = newGenre;

	}

	public long getDuration() {
		return this.duration;
	}

	public void setDuration(long newDuration) {
		this.duration = newDuration;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double newRate) {
		this.rate = newRate;
	}

	public List<Person> getCast() {
		return this.cast;
	}

	public void setCast(List<Person> newCast) {
		this.cast = newCast;
	}

	public String toXMLString() {

		StringBuffer xmlStringBlock = new StringBuffer();

		xmlStringBlock.append("\n\t<movie>");
		xmlStringBlock.append("\n\t\t" + Tools.toXMLTag("title", getTitle()));
		xmlStringBlock.append("\n\t\t" + Tools.toXMLTag("genre", String.valueOf(getGenre())));
		xmlStringBlock.append("\n\t\t" + Tools.toXMLTag("duration", String.valueOf(getDuration())));
		xmlStringBlock.append("\n\t\t" + Tools.toXMLTag("rate", String.valueOf(getRate())));
		xmlStringBlock.append("\n\t\t<cast>");
		for (Person person : getCast()) {
			xmlStringBlock.append(person.toXMLString());
		}
		xmlStringBlock.append("\n\t\t</cast>");
		xmlStringBlock.append("\n\t</movie>");

		return xmlStringBlock.toString();

	}
}
