import java.util.List;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(Show show, Person musicAuthor, String librettoText, int choirSize) {
        super(show, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(MusicalShow musicalShow, int choirSize) {
        super(
                musicalShow,
                musicalShow.getMusicAuthor(),
                musicalShow.getLibrettoText()
        );

        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
