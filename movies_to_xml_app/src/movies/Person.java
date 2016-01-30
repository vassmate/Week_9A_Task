package movies;

public class Person {

	enum Gender {
		MALE, FEMALE
	}

	String firstName;
	String lastName;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;

	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGander(Gender newGender) {
		this.gender = newGender;
	}

	public boolean getHasOscar() {
		return this.hasOscar;
	}

	public void setHasOscar(boolean newOscar) {
		this.hasOscar = newOscar;
	}

	public boolean getHasGoldenGlobe() {
		return this.hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean newGoldenGlobe) {
		this.hasGoldenGlobe = newGoldenGlobe;
	}

	public String toXMLString() {

		StringBuffer xmlStringBlock = new StringBuffer();

		xmlStringBlock.append("\n\t\t\t<person>");
		xmlStringBlock.append("\n\t\t\t\t" + Tools.toXMLTag("firstName", getFirstName()));
		xmlStringBlock.append("\n\t\t\t\t" + Tools.toXMLTag("lastName", getLastName()));
		xmlStringBlock.append("\n\t\t\t\t" + Tools.toXMLTag("gender", String.valueOf(getGender())));
		xmlStringBlock.append("\n\t\t\t\t" + Tools.toXMLTag("hasOscar", String.valueOf(getHasOscar())));
		xmlStringBlock.append("\n\t\t\t\t" + Tools.toXMLTag("hasGoldenGlobe", String.valueOf(getHasGoldenGlobe())));
		xmlStringBlock.append("\n\t\t\t</person>");

		return xmlStringBlock.toString();
	}

	public String toString() {

		return this.firstName + " " + this.lastName;

	}

}
