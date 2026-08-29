import java.util.Objects;

public class Director extends Person {
    private int numberOfShows;

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;
    }

    public Director(Person person, int numberOfShows) {
        super(person.getGender(), person.getName(), person.getSurname());
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + "кол-во постановок: " + numberOfShows + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Integer.hashCode(numberOfShows);
    }
}
