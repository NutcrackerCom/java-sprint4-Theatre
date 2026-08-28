import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(Gender gender, String name, String surname, double height) {
        super(gender, name, surname);
        this.height = height;
    }

    public Actor(Person person, double height) {
        super(person.getGender(), person.getName(), person.getSurname());
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "Рост: " + height + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(height);
    }
}
